{"ClusterName" "33333333-bbbb-cccc-dddd-ffffffffffff",
 "LastChecked" "2020-01-23T16:15:59.478901889Z",
 "OrgID" "wrong-org-id",
 "Report" {"fingerprints" [],
           "info" [{"component" "ocp.rules.cluster_id.report",
                    "details" {"cluster_id" "33333333-bbbb-cccc-dddd-ffffffffffff",
                               "grafana_link" "",
                               "info_key" "GRAFANA_LINK",
                               "type" "info"},
                    "info_id" "cluster_id|GRAFANA_LINK",
                    "key" "GRAFANA_LINK",
                    "links" {},
                    "tags" [],
                    "type" "info"}
                   {"component" "ocp.rules.version_info.report",
                    "details" {"current" "4.4.0-0.ci-2020-01-13-195732",
                               "desired" "4.4.0-0.ci-2020-01-14-154424",
                               "info_key" "CLUSTER_VERSION_INFO",
                               "type" "info",
                               "update_time" "22 minutes 57 seconds"},
                    "info_id" "version_info|CLUSTER_VERSION_INFO",
                    "key" "CLUSTER_VERSION_INFO",
                    "links" {},
                    "tags" [],
                    "type" "info"}],
           "reports" [{"component" "ocp.rules.version_check.report",
                       "details" {"current" "4.4.0-0.ci-2020-01-13-195732",
                                  "desired" "4.4.0-0.ci-2020-01-14-154424",
                                  "error_key" "CLUSTER_VERSION_DESIRED",
                                  "type" "rule"},
                       "key" "CLUSTER_VERSION_DESIRED",
                       "links" {},
                       "rule_id" "version_check|CLUSTER_VERSION_DESIRED",
                       "tags" [],
                       "type" "rule"}],
           "skips" [{"details" "All: ['ocp.metrics.version.VersionMetric', 'ocp.metrics.version_available_updates.VersionAvailableUpdatesMetric'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.telemetry.version_info.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.specs.must_gather_ocs.PersistentVolumeClaimsMGOCS'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.ocs.pvc_phase_check.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.metrics.version.VersionMetric'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.telemetry.version_check.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.metrics.subscription_labels.SubscriptionLabelsMetric'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.telemetry.support_check.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.machine_pools.MachinePool', 'ocp.specs.must_gather.OCVersionCurrentLogs'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.machine_update_stuck.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.certificates.Certificates'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.certificates_info.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.events.Events'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.event_nfs_conf.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.machine_pools.MachinePool'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.machine_pool_info.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.certificates.Certificates'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.certificates_expiration.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.certificates.Certificates'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.certificates_validity.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.machine_pools.MachinePool'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.machine_pool_check.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.nodes.Nodes'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.nodes_info.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.pods.Pods'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.pods_check_containers.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.nodes.Nodes'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.nodes_pressure_check.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.operators.Operators'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.unable_to_sync_storage.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.pods.Pods'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.pods_crash_loop_check.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.nodes.Nodes'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.nodes_requirements_check.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.operators.Operators'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.operators_check.report",
                     "type" "skip"}
                    {"details" "All: ['ocp.models.pods.Pods'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ocp.rules.pods_check.report",
                     "type" "skip"}],
           "system" {"hostname" nil, "metadata" {}}},
 "Version" 1}
