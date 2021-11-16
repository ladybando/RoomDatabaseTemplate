#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
#parse("File Header.java")

@Database(entities = [${ITEM_CLASS}::class.java], version = 1, exportSchema = false)

abstract class ${NAME} : RoomDatabase() {
    abstract fun ${FUNCTION_NAME}() : ${CLASS_NAME}
    companion object{
         @Volatile
         private var INSTANCE: ${CLASS_NAME}? = null
    
         fun ${FUNCTION_NAME}(context: Context): ${CLASS_NAME}{
         return INSTANCE ?: synchronized(this) { 
                val instance = Room.databaseBuilder(
                   context.applicationContext,
                   ItemRoomDatabase::class.java,
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
