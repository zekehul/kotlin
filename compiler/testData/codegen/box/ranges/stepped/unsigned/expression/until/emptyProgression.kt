// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KOTLIN_CONFIGURATION_FLAGS: +JVM.USE_OLD_INLINE_CLASSES_MANGLING_SCHEME
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 2u until 2u
    for (i in uintProgression step 2) {
        uintList += i
    }
    assertTrue(uintList.isEmpty())

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 2uL until 2uL
    for (i in ulongProgression step 2L) {
        ulongList += i
    }
    assertTrue(ulongList.isEmpty())

    return "OK"
}