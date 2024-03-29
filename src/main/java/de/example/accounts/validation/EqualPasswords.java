package de.example.accounts.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordComparator.class)
@Target( { ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface EqualPasswords {
    String message() default "Passwords not equal";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}