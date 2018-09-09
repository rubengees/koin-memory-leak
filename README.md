# koin-memory-leak

Repository for reproduction of a memory leak ([related issue](https://github.com/InsertKoinIO/koin/issues/220))
in `Koin` when using `sharedViewModel` with parameters.
To see the leak, install the debug variant, open the app and close it.

With the Android Sdk installed and a device or emulator connected, run:

```bash
./gradlew runDebug
```

[Hprof](dump.hprof)
![Leak](leak.png)
