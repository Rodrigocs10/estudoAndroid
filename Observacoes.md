#Observações
###19/10/14###
>As your activity **begins to stop**, the system calls onSaveInstanceState() so your activity can save state information with a collection of key-value pairs. The default implementation of this method saves information about the state of the activity's view hierarchy, such as the text in an EditText widget or the scroll position of a ListView.

To save additional state information for your activity, you must implement onSaveInstanceState() and add key-value pairs to the Bundle object

###20/10/14###
> Creating a Fragment
>**Note**: If you decide that the minimum API level your app requires is 11 or higher, you don't need to use the Support Library and can instead use the framework's built in Fragment class and related APIs. Just be aware that this lesson is focused on using the APIs from the Support Library, which use a specific package signature and sometimes slightly different API names than the versions included in the platform.
>**If you're using the v7 appcompat library**, your activity should instead extend ActionBarActivity, which is a subclass of FragmentActivity (for more information, read Adding the Action Bar).
>To perform a transaction such as add or remove a fragment, you must use the FragmentManager to create a FragmentTransaction, which provides APIs to add, remove, replace, and perform other fragment transactions.
>... **you should design** for reuse and avoid directly manipulating one fragment from another fragment. This is especially important because a modular fragment allows you to change your fragment combinations for different screen sizes. ...
>**Note:** If your fragment is a subclass of ListFragment, the default implementation returns a ListView from onCreateView(), so you don't need to implement it.