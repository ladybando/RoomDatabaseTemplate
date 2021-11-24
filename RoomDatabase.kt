@Database(entities = [$ENTITY_CLASS_NAME$::class], version = 1, exportSchema = false)
abstract class $CLASS_NAME$ : RoomDatabase() {

    abstract fun $DAO_FUNCTION_NAME$() : $DAO_CLASS_NAME$
    companion object{
         @Volatile
         private var INSTANCE: $CLASS_NAME$? = null
    
         fun $FUNCTION_NAME$(context: Context): $CLASS_NAME${
         return INSTANCE ?: synchronized(this) { 
                val instance = Room.databaseBuilder(
                   context.applicationContext,
                   $CLASS_NAME$::class.java,
                   "item_database"
                   )
                   .fallbackToDestructiveMigration()
                   .build()
               INSTANCE = instance
               return instance
            }
         }
    }
}
