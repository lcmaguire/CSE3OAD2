import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*	Define annotation interface Min
*/

/*
	CSE3OAD
	18344533
	18344533@students.latrobe.edu.au
	Liam MAGUIRE 
*/

@Retention(RetentionPolicy.RUNTIME)
// Process this annotation at runtime

@Target(ElementType.FIELD)
// This is an annotation on a field (attribute)

public @interface Min {
	public double value();
	public boolean inclusive() default true;
}