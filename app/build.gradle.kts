plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
    id("org.jetbrains.kotlin.kapt")
}

android {

    namespace = "com.example.taskmate"

    compileSdk = 35

    defaultConfig {

        applicationId = "com.example.taskmate"

        minSdk = 24
        targetSdk = 35

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner =
            "androidx.test.runner.AndroidJUnitRunner"
    }


    buildFeatures {
        compose = true
    }


    compileOptions {

        sourceCompatibility =
            JavaVersion.VERSION_17

        targetCompatibility =
            JavaVersion.VERSION_17
    }


    packaging {

        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}



kotlin {

    jvmToolchain(17)
}



dependencies {


    // =========================
    // ANDROID CORE
    // =========================

    implementation(
        "androidx.core:core-ktx:1.15.0"
    )

    implementation(
        "androidx.lifecycle:lifecycle-runtime-ktx:2.8.7"
    )

    implementation(
        "androidx.activity:activity-compose:1.9.3"
    )



    // =========================
    // COMPOSE
    // =========================

    implementation(
        platform(
            "androidx.compose:compose-bom:2024.12.01"
        )
    )


    implementation(
        "androidx.compose.ui:ui"
    )

    implementation(
        "androidx.compose.ui:ui-graphics"
    )


    implementation(
        "androidx.compose.ui:ui-tooling-preview"
    )


    implementation(
        "androidx.compose.material3:material3"
    )



    // =========================
    // NAVIGATION
    // =========================

    implementation(
        "androidx.navigation:navigation-compose:2.8.5"
    )



    // =========================
    // VIEWMODEL
    // =========================

    implementation(
        "androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7"
    )



    // =========================
    // ROOM DATABASE
    // =========================

    val room_version = "2.7.0"


    implementation(
        "androidx.room:room-runtime:$room_version"
    )


    implementation(
        "androidx.room:room-ktx:$room_version"
    )


    kapt(
        "androidx.room:room-compiler:$room_version"
    )



    // =========================
    // DEBUG
    // =========================

    debugImplementation(
        "androidx.compose.ui:ui-tooling"
    )



    // =========================
    // TEST
    // =========================

    testImplementation(
        "junit:junit:4.13.2"
    )


    androidTestImplementation(
        "androidx.test.ext:junit:1.2.1"
    )


    androidTestImplementation(
        "androidx.test.espresso:espresso-core:3.6.1"
    )
}