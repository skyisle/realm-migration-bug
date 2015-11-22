1. To reproduces crash

   ```
   $ ./gradlew installBeforeDebug
   $ adb shell am start -n com.the42apps.realmmigration/.MainActivity
   $ ./gradlew installAfterDebug
   $ adb shell am start -n com.the42apps.realmmigration/.MainActivity
   $ adb logcat
   ```

2. See pk table scheme changes with [stetho](http://facebook.github.io/stetho/)

   ```
   $ ./gradlew installAfterDebug
   $ adb shell am start -n com.the42apps.realmmigration/.MainActivity
   ```