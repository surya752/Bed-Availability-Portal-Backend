package com.capgemini.bedavailabilityportal.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Target({ElementType.FIELD, ElementType.PARAMETER})

@Retention(RetentionPolicy.RUNTIME)

@Documented
@Constraint(validatedBy = BedavaliabilityValidator.class)
public @interface ValidateBedAvaliability {

    String message() default "{It must be Booked or avaliable}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
