# RoomDatabaseTemplate

Basic template to implement a Rooms database

## Database Template

Used to make creating database class easier

### Set Up

- Press Ctrl + Shift + A (Windows) or Cmd + Shift + A (Mac) to open Action Window and type <strong>Add Template</strong>. You can also click on <em>File > Settings > Live Templates</em>.
- ![addTemplate](https://user-images.githubusercontent.com/29929889/142737465-e64f8d33-1091-4c80-a1fb-db987686897a.jpg)
- Click on the arrow to the left of <strong>Kotlin</strong>.  
![kotlinselect](https://user-images.githubusercontent.com/29929889/142737695-987f0a0a-5e33-4996-b00d-895c9a9cbb0e.jpg)

- Click on the <strong>Plus</strong> ➕ icon
![plusIcon](https://user-images.githubusercontent.com/29929889/142737488-bc891c80-f759-40bf-b8ca-ceb07a94fd03.jpg)

- Click on <strong>Define</strong> next to <strong>No applicable contexts</strong> and select <strong>Kotlin</strong> from the list.
- Click on <strong>1. Live Template</strong>.
![clickliveTemplate](https://user-images.githubusercontent.com/29929889/142737475-a8c6885a-00ff-4cdd-809f-c1b558ea32b3.jpg)

- Give an abbreviated name (and description, if you like) to the template and paste the template code in the <em>Template Text</em> box.
![addAbbrev](https://user-images.githubusercontent.com/29929889/142737402-37e043ea-b3e3-4b83-a255-95defb3f1017.jpg)

- Click on <strong>Edit Variables</strong>.
- Give the classes an expression of <strong>kotlinClassName()</strong> and the functions an expression of <strong>kotlinFunctionName()</strong.
- Click on <strong>Apply</strong> and <strong>OK</strong>.


### Using the template
- Start typing your abbreviated name in your class file and hit <strong>Enter</strong>.
![afterAdd](https://user-images.githubusercontent.com/29929889/142737611-7ddb7997-374f-4d73-9007-d851a21a6a85.jpg)

- Fill in the <em>Entity</em> class name and press tab. This will move to the class name field.
![addclass](https://user-images.githubusercontent.com/29929889/142737436-f5a9eff2-f1ae-4856-a9c1-09a5be38b569.jpg)

- Fill in the class name and all instances will be filled as well and press <strong>Tab</strong>.
![multiClassFill](https://user-images.githubusercontent.com/29929889/142737616-da24616c-34fb-4fda-ba85-db3ce41970bc.jpg)

- Fill in the abstract Dao function name and class; press <strong>Tab</strong>.
- Fill in the final function name and hit <strong>Enter</strong>.
- Import all classes and make any other changes needed for your project.
