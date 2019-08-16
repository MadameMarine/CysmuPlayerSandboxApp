# Cysmu Player Sandbox App

### Music player

An interface displaying the input controls and information about the currently played song.

 ##### Play
Start or unpause a song by pressing the *play button* ▶
 ##### Pause
Pause a song by pressing the *pause button* ⏸
 ##### Go to next / previous
 Go to the next or previous song by pressing ⏭ or ⏮.
Expected behavior:
 - ⏮ Return to the previous song if the current song is not started
 - ⏮ Restart the current if it is already playing
 - ⏭ Go to the next song
 
 ##### Quick jump

By pressing quickly in the right / left side of the screen, the progress of the current song will be incremented / decremented by 15 secs.

The user may change this value.
 
 ##### Progress bar

Display a progress bar representing the progression of the current song.
  
 ##### Loop
 
Repeat a particular song or the whole queue by pressing the *repeat button*. The 3 possible state are:
- Deactivated 
- Repeat all (indefinitely) 🔁
- Repeat once 🔂
