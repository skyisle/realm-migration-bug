1. To reproduces crash

   ```
   $ ./gradlew installBeforeDebug
   $ adb shell am start -n com.the42apps.realmmigration/.MainActivity
   $ ./gradlew installAfterDebug
   $ adb shell am start -n com.the42apps.realmmigration/.MainActivity
   $ adb logcat
   ```

2. To see pk table scheme changes

   ```
   $ ./gradlew installAfterDebug
   $ adb shell am start -n com.the42apps.realmmigration/.MainActivity
   ```