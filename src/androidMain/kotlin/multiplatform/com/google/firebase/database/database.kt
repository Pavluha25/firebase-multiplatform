package multiplatform.com.google.firebase.database

import com.google.firebase.database.*
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.OnDisconnect
import com.google.firebase.database.ValueEventListener
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.tasks.asDeferred
import kotlinx.coroutines.tasks.await
import kotlin.reflect.KClass

actual fun getFirebaseDatabase() = FirebaseDatabase.getInstance()

actual typealias FirebaseDatabase = FirebaseDatabase

actual typealias DatabaseReference = DatabaseReference

actual suspend fun DatabaseReference.awaitSetValue(value: Any?) = setValue(value).await().run { Unit }

actual typealias ValueEventListener = ValueEventListener

actual typealias DataSnapshot = DataSnapshot

actual fun <T: Any> DataSnapshot.getValue(valueType: KClass<T>) = getValue(valueType.java) as T

actual typealias DatabaseError = DatabaseError

actual typealias OnDisconnect = OnDisconnect

actual suspend fun OnDisconnect.awaitRemoveValue() = removeValue().await().run { Unit }

actual suspend fun OnDisconnect.awaitCancel() = cancel().await().run { Unit }

actual suspend fun OnDisconnect.awaitSetValue(value: Any?) = setValue(value).await().run { Unit }

actual val TIMESTAMP = ServerValue.TIMESTAMP

