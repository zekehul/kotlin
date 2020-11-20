// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// KJS_WITH_FULL_RUNTIME
// KT-6153 java.lang.IllegalStateException while building
object Bug {
    fun title(id:Int) = when (id) {
        0 -> "OK"
        else -> throw Exception("unsupported $id")
    }

    private fun <T> T.header(id: Int) = StringBuilder().append(title(id))

    fun run() = header(0)
}

fun box(): String {
    return Bug.run().toString()
}