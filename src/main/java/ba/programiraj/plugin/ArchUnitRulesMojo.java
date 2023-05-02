package ba.programiraj.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;
/**
 *
 */
@Mojo(
        name = "archunit-rules",
        defaultPhase = LifecyclePhase.TEST,
        requiresDependencyResolution = ResolutionScope.TEST,
        threadSafe = true
)
public class ArchUnitRulesMojo extends AbstractMojo {

    @Override
    public void execute() {
        getLog().info("Executing nothing, at the moment.");
    }
}
