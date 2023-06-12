import react.Props
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import react.fc

val Todo = fc<Props> {

    h1 {
        +"Todo"
    }

    ul {
        h2 { +"Kotlin" }
        li { +"Function definition" }
        li { +"Extension functions" }
        li { +"Higher order functions" }
        li { +"Nullability" }
        li { +"Data classes" }

        h2 { +"Kotlin/JS" }
        li { +"WebPack" }
        li { +"HTML/CSS/Logic in Kotlin" }
        li { +"Document/Console/Window/LocalStorage etc." }
        li { +"Plain JS" }
        li { +"Exceptions" }

        h2 { +"React" }
        li { +"Class vs Functional components" }
        li { +"Properties, State & Effects" }
        li { +"Rendering" }
    }
}
