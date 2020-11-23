// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KOTLIN_CONFIGURATION_FLAGS: +JVM.USE_OLD_INLINE_CLASSES_MANGLING_SCHEME
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 1u until 9u
    for (i in (uintProgression step 2).reversed()) {
        uintList += i
    }
    assertEquals(listOf(7u, 5u, 3u, 1u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 1uL until 9uL
    for (i in (ulongProgression step 2L).reversed()) {
        ulongList += i
    }
    assertEquals(listOf(7uL, 5uL, 3uL, 1uL), ulongList)

    return "OK"
}