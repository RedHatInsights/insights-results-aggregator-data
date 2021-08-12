### Normal messages with content to be used by CCX Notification Writer

These are messages with expected format and content. The content (basically set
of rules) is prepared to be used by *CCX Notification Writer* and later by *CCX
Notification Service*.

These messages are stored in `messages/normal_for_notification_tests/` subdirectory.

* [03\_rules\_hits\_org\_1.json](03_rules_hits_org_1.json) artificially created report with specified number of rule hits for org\_id=1
* [03\_rules\_hits\_org\_2.json](03_rules_hits_org_2.json) artificially created report with specified number of rule hits for org\_id=2
* [04\_rules\_hits\_org\_1.json](04_rules_hits_org_1.json) artificially created report with specified number of rule hits for org\_id=1
* [04\_rules\_hits\_org\_2.json](04_rules_hits_org_2.json) artificially created report with specified number of rule hits for org\_id=2
* [05\_rules\_hits\_org\_1.json](05_rules_hits_org_1.json) artificially created report with specified number of rule hits for org\_id=1
* [05\_rules\_hits\_org\_3.json](05_rules_hits_org_3.json) artificially created report with specified number of rule hits for org\_id=3
* [no\_hits\_org\_1.json](no_hits_org_1.json) data with no rule hits and no skips (ie. there's no health check performed)

Please note that all messages are stored in JSON format to be consumed by *CCX
Notification Writer* service. Additionally all messages are also stored in EDN
format to be consumed by analysis tools.
