package com.capgemini.bedavailabilityportal.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class BedavaliabilityValidator implements ConstraintValidator<ValidateBedAvaliability,String>{

    @Override
    public boolean isValid(String bedAvailability, ConstraintValidatorContext constraintValidatorContext) {
        List<String> Bedavailability= Arrays.asList("Booked","Available");
        return Bedavailability.contains(bedAvailability);
    }
}
