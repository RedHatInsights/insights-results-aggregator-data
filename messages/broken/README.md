#### Messages with unexpected format and/or content

These messages should be rejected by *Insights Results Writer* and also by *CCS
Notification Writer* services as their format is unexpected or wrong at all.
OTOH such data are very valuable for testing etc.

These messages are stored in `messages/broken/` subdirectory.

* `messages/broken/added_items*.json` - reports with added items (that should not be in there)
* `messages/broken/mutated_items*.json` - reports with mutated items
* `messages/broken/without_*.json` - reports without one or more attributes

Please note that all messages are stored in JSON format to be consumed by
*Insights Results Writer* service. Additionally all messages are also stored in
EDN format to be consumed by analysis tools.
