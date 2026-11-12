/**
 * Precompiled [snaply.android.compose.gradle.kts][Snaply_android_compose_gradle] script plugin.
 *
 * @see Snaply_android_compose_gradle
 */
public
class Snaply_android_composePlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Snaply_android_compose_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
