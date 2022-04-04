object Dependency {

    private const val room_version = "2.4.2"
    private const val legacy_support_version = "1.0.0"
    private const val lifecycle_version = "2.4.1"
    private const val lifecycle_viewModel_version = "2.4.1"
    private const val coroutine_version = "1.5.2"
    private const val androidx_navigation = "1.5.2"
    private const val android_core = "1.7.0"
    private const val androidSupport = "1.1.0"
    private const val viewModel = "2.2.0"
    private const val liveData = "2.2.0"

    const val room_dep = "androidx.room:room-runtime:$room_version"
    const val legacy_support_dep = "androidx.legacy:legacy-support-v4:$legacy_support_version"
    const val lifecycle_dep = "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"
    const val room_compiler_dep = "androidx.room:room-compiler:$room_version"

    // ViewModel utilities for Compose
    const val lifecycle_viewModel_dep =
        "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_viewModel_version"

    // LiveData
    const val liveData_dep = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"

    // Saved state module for ViewModel
    const val viewModel_state_dep =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version"
    const val viewModel_dep =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"

    // Annotation processor
    const val kapt_dep = "androidx.lifecycle:lifecycle-compiler:$lifecycle_version"

    const val coroutine_dep = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutine_version"
    const val coroutineAndroid_dep =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutine_version"

    const val androidx_navigation_fragment_dep =
        "androidx.navigation:navigation-fragment-ktx:$androidx_navigation"
    const val fragment_dep =
        "androidx.fragment:fragment-ktx:$androidx_navigation"
    const val activity_dep = "androidx.activity:activity-ktx:$androidx_navigation"
    const val android_core_dep = "androidx.core:core-ktx:$android_core"

    val appcompact = "androidx.appcompat:appcompat:${androidSupport}"

    val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${viewModel}"
    val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${liveData}"


}