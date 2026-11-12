/**
 * Precompiled [snaply.kotlin.library.gradle.kts][Snaply_kotlin_library_gradle] script plugin.
 *
 * @see Snaply_kotlin_library_gradle
 */
public
class Snaply_kotlin_libraryPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Snaply_kotlin_library_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
