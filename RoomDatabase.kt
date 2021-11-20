@Database(entities = [ItemRoomDatabase::class], version = 1, exportSchema = false)
abstract class ItemRoomDatabase : RoomDatabase() {
//Remove parentheses and enter Dao Class name
    abstract fun itemDao() : "$DAO_CLASS_NAME$"
    
    companion object{
         @Volatile
         private var INSTANCE: ItemRoomDatabase? = null
    
         fun getDatabase(context: Context): ItemRoomDatabase{
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
