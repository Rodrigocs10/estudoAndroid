#Observações
###19/10/14###
>As your activity **begins to stop**, the system calls onSaveInstanceState() so your activity can save state information with a collection of key-value pairs. The default implementation of this method saves information about the state of the activity's view hierarchy, such as the text in an EditText widget or the scroll position of a ListView.

To save additional state information for your activity, you must implement onSaveInstanceState() and add key-value pairs to the Bundle object

