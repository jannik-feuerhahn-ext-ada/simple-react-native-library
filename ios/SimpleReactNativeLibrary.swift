@objc(SimpleReactNativeLibrary)
class SimpleReactNativeLibrary: NSObject {

  @objc func launchSDK(_ url: NSString, callback: RCTResponseSenderBlock) {
    
    // let params = try! AdaParameters.Builder().locale("en-US").url(url as String).build()
    
    // DispatchQueue.main.async {
    //   let parentViewController = UIApplication.topMostViewController!
    //   AdaChatbot.present(parentViewController: parentViewController, adaParameters: params)
    // }

    let msg = "Fake Launched SDK with url: \(url)"
    print(msg)
    callback([nil, msg])
  }
}
