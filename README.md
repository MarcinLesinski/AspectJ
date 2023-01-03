# Aspects
Here are few aspects of using... aspects:

### Samples
#### On working app
Run endpoint from [samples](samples.http) when application is running. You can run application using gradle run task, i.e.:

    ./gradlew run 

#### In Test framework
* [logging](src/test/kotlin/com/example/demo/logging/LoggingSample.kt)
* [using aspect with annotation](src/test/kotlin/com/example/demo/annotation/AnnotationSample.kt)  
* [changing behaviour](src/test/kotlin/com/example/demo/behaviour/ChangeBehaviourSample.kt)  

### Using aspects in your own project

##### gradle
    val agent: Configuration by configurations.creating
    dependencies {
        agent("org.aspectj:aspectjweaver")
        compileOnly("org.aspectj:aspectjrt")
    }
 
    tasks.withType<BootRun>{
        args = listOf("-javaagent:${agent.singleFile}")
    }


    tasks.withType<Test> {
        useJUnitPlatform()
        doFirst {
            jvmArgs("-javaagent:${agent.singleFile}")
        }
    }
    
you have to also register aspects and path where to use them, to achieve it complete [resources/META-INF/aop.xml](src/main/resources/META-INF/aop.xml) for both main and test i.e.:

    <aspectj> 
        <aspects>
            <aspect name="com.example.demo.logging.LoggingAspect"/>
            <aspect name="com.example.demo.behaviour.BehaviourAspect"/>
            <aspect name="com.example.demo.annotation.AnnotationAspect"/>
        </aspects>
    
        <weaver options="-verbose -showWeaveInfo">
            <include within="com.example.demo.logging.*"/>
            <include within="com.example.demo.behaviour.*"/>
            <include within="com.example.demo.annotation.*"/>
        </weaver> 
    </aspectj>


### Author
Marcin Lesiński
