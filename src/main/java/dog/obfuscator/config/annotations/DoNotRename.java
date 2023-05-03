package dog.obfuscator.config.annotations;

import java.lang.annotation.*;

/**
 * Tells Dogfuscator to not rename the annotated element.
 * Note that this annotation overrides whatever you have defined in the config.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface DoNotRename {

}
