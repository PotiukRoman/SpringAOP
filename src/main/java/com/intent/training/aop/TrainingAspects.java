package com.intent.training.aop;
import com.intent.training.entity.Aircraft;
import com.intent.training.entity.Plane;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TrainingAspects {

    @Pointcut("execution(public * *Audit(..))")
    private void auditPointcut() {
        // nothing here
    }

    @Pointcut("execution(public * *Inspection(..))")
    private void inspectionPointcut() {
        // nothing here
    }

    @Pointcut("execution(public * *MotorlessDevices(..))")
    private void motorlessDevicesPointcut() {
        // nothing here
    }

    @Pointcut("execution(public * *Refuel(..))")
    private void refuelPointcut() {
        // nothing here
    }



    @AfterReturning(pointcut = "auditPointcut())", returning = "response")
    public void auditAfterAdvice(JoinPoint joinPoint,Object response) {
        System.out.println("AUDIT AfterReturning respond triggered!!! : ");
        System.out.println("Status "+"  "+response);
        System.out.println();
    }

    @AfterReturning(pointcut = "inspectionPointcut()", returning = "response")
    public void inspectionAfterAdvice(JoinPoint joinPoint,Object response) {
        if((Boolean) response){
            System.out.println("AfterReturning EngineInspection triggered !!! : "+joinPoint.getSignature().getDeclaringType());
            System.out.println(" Aircraft has an engine, so there is an additional message -> no deviations were detected");
            System.out.println();
        }
    }

    @AfterReturning(pointcut = "motorlessDevicesPointcut()", returning = "response")
    public void motorlessDevicesAfterAdvice(JoinPoint joinPoint,Object response) {
        if((Boolean) response){
            System.out.println("AfterReturning ChecksMotorlessDevices triggered !!! : "+joinPoint.getSignature().getDeclaringType());
            System.out.println(" Aircraft has no engine, so there is an additional message -> follow the appropriate instructions");
            System.out.println();
        }
    }

    @Around("refuelPointcut()&& args(value0, value1)")
     public void respondAdvice(ProceedingJoinPoint point, Aircraft value0, int value1) throws Throwable {
        System.out.println("Refueler say: total fuel supply before refueling: " + value0.getFuelType() + " " + value0.getFuelLevel());
        Object proceed = point.proceed();
        System.out.println("Refueled " + value0.getFuelType() + " in volume " + value1);
        System.out.println();
    }

    @Around("refuelPointcut()&& args(value0, value1, value2)")
    public void respondAdvice(ProceedingJoinPoint point, Aircraft value0, int value1, int value2) throws Throwable {
        System.out.println("Refueler say: total fuel supply before refueling: "+ value0.getFuelType1() + " " + value0.getFuelLevel1() + " : " + value0.getFuelType2() + " " + value0.getFuelLevel2() );
        Object proceed = point.proceed();
        System.out.println("Refueled " + value0.getFuelType1() + " in volume " + value1 + " : " + value0.getFuelType2() + " in volume " + value2  );
        System.out.println();
    }
}
