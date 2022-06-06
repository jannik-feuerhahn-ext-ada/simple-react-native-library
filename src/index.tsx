import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `The package 'simple-react-native-library' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo managed workflow\n';

const SimpleReactNativeLibrary = NativeModules.SimpleReactNativeLibrary
  ? NativeModules.SimpleReactNativeLibrary
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function launchSDK(url: string, callback: Function): void {
  return SimpleReactNativeLibrary.launchSDK(url, callback);
}
