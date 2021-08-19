# insights-results-aggregator-data

![GitHub go.mod Go version](https://img.shields.io/github/go-mod/go-version/RedHatInsights/insights-results-aggregator-data)
[![License](https://img.shields.io/badge/license-Apache-blue)](https://github.com/RedHatInsights/insights-results-aggregator-data/blob/master/LICENSE)

Data shared by insights-results-\* microservices that can be used for mocking and testing.

Three types of data are stored in this repository:

1. Messages to be consumed by *Insights Results Writer* and *CCX Notification Writer* services
1. Cluster reports as produced by the *Smart Proxy* via its REST API interface
1. Test data in format of Go structures to be used in all form of tests (unit tests, integration tests...)

## Messages to be consumed by Insights Results Writer service

Data (messages) to be consumed by *Insights Results Writer* service (it's
source code is shared with *Insights Results Aggregator* service) through
Kafka broker. These data are stored in `messages` subdirectory and are
splitted into various sub-directories.

The mentioned tools are available at https://github.com/RedHatInsights/insights-results-aggregator-utils/blob/master/input/produce.sh and
https://github.com/RedHatInsights/insights-results-aggregator-utils/blob/master/input/produce_50k_messages.sh

Several types of messages are prepared there. There are splitted into groups.
Each group is stored in its own subdirectory:

* `normal`
* `normal_no_version`
* `normal_wrong_version`
* `normal_for_notification_tests`
* `broken`
* `invalid`
* `invalid_no_account_number`
* `invalid_no_cluster_name`
* `invalid_no_last_checked`
* `invalid_no_organization_id`
* `invalid_no_report`
* `invalid_no_version`
* `invalid_string_version`
* `invalid_wrong_cluster_name`
* `invalid_wrong_last_checked`
* `invalid_wrong_org_id`
* `invalid_wrong_report`
* `results_no_tutorial`
* `results_tutorial`



### Normal messages with expected format and content

*Insights Results Writer* service should be able to consume and process these
messages, because their format and content are correct.

These messages are stored in `messages/normal` subdirectory.

Please look into [this document](messages/normal/README.md) for detailed description.



### Normal messages with expected format but with missing version info

*Insights Results Writer* service should be able to consume these messages as
they have correct format. But the `version` attribute is missing, so these
messages should be rejected after consumption.

These messages are stored in `messages/normal_no_version` subdirectory.

Please look into [this document](messages/normal_no_version/README.md) for detailed description.



### Normal messages with expected format but with wrong version info

*Insights Results Writer* service should be able to consume these messages as
they have correct format. But the `version` attribute is set to unexpected (too
high) value, so these messages should be rejected after consumption.

These messages are stored in `messages/normal_wrong_version` subdirectory.

Please look into [this document](messages/normal_wrong_version/README.md) for detailed description.



### Normal messages with content to be used by CCX Notification Writer

These are messages with expected format and content. The content (basically set
of rules) is prepared to be used by *CCX Notification Writer* and later by *CCX
Notification Service*.

These messages are stored in `messages/normal_for_notification_tests/` subdirectory.

Please look into [this document](messages/normal_for_notification_tests/README.md) for detailed description.



#### Messages with unexpected format and/or content

These messages should be rejected by *Insights Results Writer* and also by *CCS
Notification Writer* services as their format is unexpected or wrong at all.
OTOH such data are very valuable for testing etc.

These messages are stored in `messages/broken/` subdirectory.

Please look into [this document](messages/broken/README.md) for detailed description.



#### Messages with invalid format - missing account number

These messages should be rejected by *Insights Results Writer* and also by *CCS
Notification Writer* services as the `account_number` attribute is missing.

These messages are stored in `messages/invalid_no_account_number/` subdirectory.

Please look into [this document](messages/invalid_no_account_number/README.md) for detailed description.



#### Messages with invalid format - missing cluster name

These messages should be rejected by *Insights Results Writer* and also by *CCS
Notification Writer* services as the `cluster_name` attribute is missing.

These messages are stored in `messages/invalid_no_cluster_name/` subdirectory.

Please look into [this document](messages/invalid_no_cluster_name/README.md) for detailed description.



#### Messages with invalid format - missing last checked timestamp

These messages should be rejected by *Insights Results Writer* and also by *CCS
Notification Writer* services as the `last_checked` attribute is missing.

These messages are stored in `messages/invalid_no_last_checked/` subdirectory.

Please look into [this document](messages/invalid_no_last_checked/README.md) for detailed description.



#### Messages with invalid format - missing organization ID

These messages should be rejected by *Insights Results Writer* and also by *CCS
Notification Writer* services as the `org_id` attribute is missing.

These messages are stored in `messages/invalid_no_organization_id/` subdirectory.

Please look into [this document](messages/invalid_no_organization_id/README.md) for detailed description.



## Test data

`github.com/RedHatInsights/insights-results-aggregator-data/testdata` package contains files with repeated data 
to be used in tests

## Reports generated by Insights Reports Aggregator

Reports are stored in `reports` directory. It is splitted into three subdirectories:

* `original` contains reports as read from Insights Reports Aggregator
* `formatted` contains reports as formatted JSON files (for better readability)
* `edn` contains reports converted into EDN format

### Clusters that return 'static' rule results

```
34c3ecc5-624a-49a5-bab8-4fdc5e51a266
74ae54aa-6577-4e80-85e7-697cb646ff37
a7467445-8d6a-43cc-b82c-7007664bdf69
ee7d2bf4-8933-4a3a-8634-3328fe806e08
```

### Cluster that returns no results (ie just empty report)

```
eeeeeeee-eeee-eeee-eeee-000000000001
```
