import kotlinx.browser.document
import kotlinx.browser.window
import react.Props
import react.dom.button
import react.dom.onClick
import react.dom.render
import react.fc
import react.useState

fun main() {
    window.onload = {
        render(document.getElementById("root")!!) {
            child(App)
        }
    }
}

val App = fc<Props> {
    var showTodo by useState(false)

    button {
        attrs.onClick = { showTodo = !showTodo }
        +"Toggle Todo / Canvas"
    }

    if (showTodo) {
        child(Todo)
    } else {
        child(Canvas)
    }
}
