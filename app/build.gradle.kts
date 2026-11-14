plugins { id("com.android.application") }
android {
 namespace = "br.com.oficinadepregacoes"
 compileSdk = 35
 defaultConfig { applicationId = "br.com.oficinadepregacoes"; minSdk = 26; targetSdk = 35; versionCode = 1; versionName = "0.2-demo" }
 compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
}
