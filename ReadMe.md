# Nested RecyclerView Sample Application
This is a Sample App to Demo working of a Nested RecyclerView, Where the parent RecyclerView will hold multiple Child RecylerView like in Spotify

### App Constist of serveral Parts : 
- **main branch** : basic Network Layer , getting the list Quotes using Flow API and Retrofit
- **RecView branch**: basic Simple RecyclerView, with button show click event is done using interface
- **RecView2 branch** : implented ListAdapter with DiffUtils, with button click event with lambda callback
- **NestedRecView branch** : coming soon


### Major Highlights:
- Network Layer : Retrofit
- Flow API used to emit and collect list of quotes
- SimpleQuoteAdapter : used ListAdapter which uses DiffUtils to compare new list & Old list in background thread 
- 


<p align="center">
  <img alt="RecView1" src="https://github.com/aman1sr/RecycleInRecyclerView/blob/RecView/screenshot/simpleRecView.png?raw=true" width="360" height="640">
</p>

