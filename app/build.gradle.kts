import java.util.Properties
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

val localProps = Properties()
val localPropFile = rootProject.file("local.properties")
if (localPropFile.exists()) {
    localProps.load(localPropFile.inputStream())
}
//val baseUrl = localProps.getProperty("BASE_URL")

android {
    namespace = "com.hkw.a0930_xml_setting"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.hkw.a0930_xml_setting"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        debug {
            isMinifyEnabled = false
//            buildConfigField("String", "BASE_URL", "\"${baseUrl}\"")
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = true
//            buildConfigField("String", "BASE_URL", "\"http://10.20.123:1000\"")

        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)
    implementation(libs.androidx.splashscreen)
    implementation(libs.android.pdf.viewer)
    implementation(libs.coil.compose)
    implementation(libs.photoview)
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging.interceptor)
}