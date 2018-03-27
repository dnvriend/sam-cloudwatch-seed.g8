package $package$

import com.github.dnvriend.lambda._
import com.github.dnvriend.lambda.annotation.CloudWatchConf

@CloudWatchConf(
  pattern =
    """{
    "source": [
      "aws.codebuild"
    ],
    "detail": {
      "build-status": [
        "FAILED"
      ],
      "project-name": [
        "SBT-SAM"
      ]
    }
  }""")
class CloudWatchLambda extends CloudWatchEventHandler {
  override def handle(event: CloudWatchEvent, ctx: SamContext): Unit = {
    println("Triggered by the following CloudWatchEvent: " +  event)
  }
}