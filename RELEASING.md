# Releasing

The following list describe the steps necessary to release a new version.

1. Run all tests (including all examples + integration)
2. Run docker compose and manually test ui (or verify on website):
   1. AMQP: https://amqp.demo.springwolf.dev/
   2. CloudStream https://cloud-stream.demo.springwolf.dev/
   3. Kafka: https://kafka.demo.springwolf.dev/
   4. SQS: https://sqs.demo.springwolf.dev/
3. Remove the `-SNAPHSOT` postfix in `.env`, create a new branch `release/0.X.X` (version number), commit & push
4. Run GitHub `Publish releases` pipeline from the newly created release branch
5. Release version in nexus
6. Update version number on website
7. Update the version number in `.env` for next snapshot on branch `master`, commit & push
