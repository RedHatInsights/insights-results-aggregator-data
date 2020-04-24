# insights-results-aggregator-data

Data (messages) to be consumed by Insights Results Aggregator

## Mock data for aggregator

Data to be consumed by aggregator through Kafka broker is prepared in `messages/` subdirectory.
Several types of data are available there:

* `messages/results_no_tutorial/r_[0-9]*.json` - real data analyzed from test clusters
* `messages/results_tutorial/r_tutorial_[0-9]*.json` - real data analyzed from test clusters with added tutorial rule result
* `messages/normal/result*.json` - artifically created data
* `messages/normal/big_resuts.json` - file with most reports created by joining several real data (no cluster is in the state when all rules fail)
* `messages/normal/big_results_tutorial.json` - the same, but with tutorial rule result
* `messages/normal/big_results_no_skips.json` - the same, but no skipped rules are stored
* `messages/normal/big_results_no_skips_tutorial.json` - the same, but with tutorial rule result
* `messages/normal/no_hits.json` - data with no rule hits (ie. the cluster is healthy)
* `messages/normal/no_hits_no_skips.json` - data with no rule hits and no skips (ie. there's no health check performed)
* `messages/normal/tutorial_only.json` - report with only tutorial rule hit
* `messages/broken/added_items*.json` - reports with added items (that should not be in there)
* `messages/broken/mutated_items*.json` - reports with mutated items
* `messages/broken/without_*.json` - reports without one or more attributes
