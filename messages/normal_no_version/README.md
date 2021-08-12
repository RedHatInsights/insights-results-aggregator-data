### Normal messages with expected format but with missing version info

*Insights Results Writer* service should be able to consume these messages as
they have correct format. But the `version` attribute is missing, so these
messages should be rejected after consumption.

These messages are stored in `messages/normal_no_version` subdirectory.

* [05\_rules\_hits.json](05_rules_hits.json) report with exactly 5 rule hits for org\_id=11789772
* [05\_rules\_hits\_org\_1.json](05_rules_hits_org_1.json) report with exactly 5 rule hits for org\_id=1
* [10\_rules\_hits.json](10_rules_hits.json) report with exactly 10 rule hits for org\_id=11789772
* [10\_rules\_hits\_org\_1.json](10_rules_hits_org_1.json) report with exactly 10 rule hits for org\_id=1
* [15\_rules\_hits.json](15_rules_hits.json) report with exactly 15 rule hits for org\_id=11789772
* [15\_rules\_hits\_org\_1.json](15_rules_hits_org_1.json) report with exactly 15 rule hits for org\_id=1
* [big\_results.json](big_results.json) file with most reports created by joining several real data (no cluster is in the state when all rules fail)
* [big\_results\_tutorial.json](big_results_tutorial.json) the same as report above, but with tutorial rule result
* [big\_results\_no\_skips.json](big_results_no_skips.json) the same as report above, but no skipped rules are stored
* [big\_results\_no\_skips\_tutorial.json](big_results_no_skips_tutorial.json) the same as report above, but with tutorial rule result
* [big\_results\_org\_1.json](big_results_org_1.json) file with most reports, in this case for org\_id=1
* [no\_hits.json](no_hits.json) data with no rule hits (ie. the cluster is healthy)
* [no\_hits\_no\_skips.json](no_hits_no_skips.json) data with no rule hits and no skips (ie. there's no health check performed)
* [result01.json](result01.json) artificially created report with specified number of rule hits
* [result02.json](result02.json) artificially created report with specified number of rule hits
* [result03.json](result03.json) artificially created report with specified number of rule hits
* [result04.json](result04.json) artificially created report with specified number of rule hits
* [result05.json](result05.json) artificially created report with specified number of rule hits
* [tutorial\_only.json](tutorial_only.json) report with only tutorial rule hit

Please note that all messages are stored in JSON format to be consumed by
*Insights Results Writer* service. Additionally all messages are also stored in
EDN format to be consumed by analysis tools.
