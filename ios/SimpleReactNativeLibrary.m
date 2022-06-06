#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(SimpleReactNativeLibrary, NSObject)

RCT_EXTERN_METHOD(launchSDK:(NSString)url callback:(RCTResponseSenderBlock)callback)

@end
