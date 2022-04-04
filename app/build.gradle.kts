plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.baseui"
        minSdk = 26
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("com.androidx.support.constraint:constraint-layout:2.0.4")
    implementation(project(mapOf("path" to ":baseui")))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("com.androidx.support.test:runner:1.0.2")
    androidTestImplementation("com.androidx.support.test.espresso:espresso-core:3.0.2")
    implementation(Dependency.coroutine_dep)
    implementation(Dependency.coroutineAndroid_dep)
    implementation(Dependency.lifecycle_dep)
    implementation(Dependency.viewModel_dep)
    implementation(Dependency.lifecycle_viewModel_dep)
    implementation(Dependency.androidx_navigation_fragment_dep)
    implementation(Dependency.room_dep)
    kapt(Dependency.room_compiler_dep)
    implementation(Dependency.fragment_dep)
    implementation(Dependency.activity_dep)
    implementation(Dependency.android_core_dep)
    implementation(Dependency.appcompact)
    implementation(Dependency.livedataKtx)
    implementation(Dependency.viewModelKtx)

}