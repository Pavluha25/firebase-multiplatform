package multiplatform.com.google.firebase

actual fun initializeFirebaseApp(context: Any, options: FirebaseOptions): FirebaseApp {
    TODO("not implemented")
}

actual class FirebaseApp
actual class FirebaseOptions
actual class FirebaseOptionsBuilder actual constructor()

actual open class FirebaseException : Exception()

actual fun getFirebaseApps(context: Any): List<FirebaseApp> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual open class FirebaseNetworkException : FirebaseException()
actual open class FirebaseTooManyRequestsException : FirebaseException()

actual open class FirebaseApiNotAvailableException : FirebaseException()

actual fun FirebaseOptionsBuilder.setGoogleAppId(googleAppId: String): FirebaseOptionsBuilder {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun FirebaseOptionsBuilder.setApiKey(apiKey: String): FirebaseOptionsBuilder {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun FirebaseOptionsBuilder.setApplicationId(applicationId: String): FirebaseOptionsBuilder {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun FirebaseOptionsBuilder.setDatabaseUrl(databaseUrl: String?): FirebaseOptionsBuilder {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun FirebaseOptionsBuilder.setStorageBucket(storageBucket: String?): FirebaseOptionsBuilder {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun FirebaseOptionsBuilder.setProjectId(projectId: String?): FirebaseOptionsBuilder {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun FirebaseOptionsBuilder.build(): FirebaseOptions {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}