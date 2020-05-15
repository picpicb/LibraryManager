
import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes



@AnalyzeClasses
class LibraryArchictectureTest {
    @ArchTest
    val rule_entities = classes().that().resideInAPackage("..entities..").should().onlyDependOnClassesThat().resideOutsideOfPackages("..external..","..usecases..","..userinterface..")

}