package co.simplon.spotmebusiness.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Constraint(validatedBy = UniqueSpotCreateValidator.class)
public @interface UniqueSpotCreate {
    String message() default "We already have been provided by this same spot, please re-issue new values";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
