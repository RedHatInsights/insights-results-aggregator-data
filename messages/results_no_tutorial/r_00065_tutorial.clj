{"ClusterName" "5d5892d3-1f74-4ccf-91af-548dfc9767aa",
 "LastChecked" "2020-04-02T09:00:05.268294Z",
 "OrgID" 11789772,
 "Report"
   {"fingerprints" [],
    "info" [],
    "pass" [],
    "reports"
      [{"component" "ccx_rules_ocp.external.rules.tutorial_rule.report",
              "details" {"error_key" "TUTORIAL_ERROR", "type" "rule"},
              "key" "TUTORIAL_ERROR",
              "links" {},
              "rule_id" "tutorial_rule|TUTORIAL_ERROR",
              "tags" [],
              "type" "rule"} {"component"
                                      "ccx_rules_ocp.external.rules.samples_op_failed_image_import_check.report",
                                    "details"
                                      {"error_key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                                       "info"
                                         {"condition" "Degraded",
                                          "lastTransitionTime" "2020-03-18T22:20:34Z",
                                          "message"
                                            "Samples installed at 4.2.0, with image import failures for these imagestreams: python ruby perl php ",
                                          "name" "openshift-samples",
                                          "reason" "FailedImageImports"},
                                       "kcs" "https://access.redhat.com/solutions/4563171",
                                       "type" "rule"},
                                    "key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                                    "links" {"kcs" ["https://access.redhat.com/solutions/4563171"]},
                                    "rule_id"
                                      "samples_op_failed_image_import_check|SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                                    "tags" [],
                                    "type" "rule"}],
    "skips"
      [{"details"
                "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
              "reason" "MISSING_REQUIREMENTS",
              "rule_fqdn" "ccx_rules_ocp.ocs.check_ocs_version.report",
              "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.PodsMGOCS'] Any: ",
                                    "reason" "MISSING_REQUIREMENTS",
                                    "rule_fqdn" "ccx_rules_ocp.ocs.check_pods_scc.report",
                                    "type" "skip"} {"details"
                                                            "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
                                                          "reason" "MISSING_REQUIREMENTS",
                                                          "rule_fqdn" "ccx_rules_ocp.ocs.operator_phase_check.report",
                                                          "type" "skip"} {"details"
                                                                                  "All: ['ccx_ocp_core.specs.must_gather_ocs.PersistentVolumeClaimsMGOCS'] Any: ",
                                                                                "reason" "MISSING_REQUIREMENTS",
                                                                                "rule_fqdn" "ccx_rules_ocp.ocs.pvc_phase_check.report",
                                                                                "type" "skip"} {"details"
                                                                                                        "All: ['ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.get_mon_reporting_clock_skew'] Any: ",
                                                                                                      "reason" "MISSING_REQUIREMENTS",
                                                                                                      "rule_fqdn" "ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.report",
                                                                                                      "type" "skip"} {"details" "All: ['ccx_ocp_core.models.proxy.Proxy'] Any: ",
                                                                                                                            "reason" "MISSING_REQUIREMENTS",
                                                                                                                            "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1766907.report",
                                                                                                                            "type" "skip"} {"details" "All: ['ccx_ocp_core.models.nodes.Nodes'] Any: ",
                                                                                                                                                  "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                  "rule_fqdn"
                                                                                                                                                    "ccx_rules_ocp.external.rules.nodes_kubelet_version_check.report",
                                                                                                                                                  "type" "skip"} {"details" "All: ['ccx_ocp_core.models.nodes.Nodes'] Any: ",
                                                                                                                                                                        "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                        "rule_fqdn"
                                                                                                                                                                          "ccx_rules_ocp.external.rules.nodes_requirements_check.report",
                                                                                                                                                                        "type" "skip"} {"details"
                                                                                                                                                                                                "All: ['ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.cluster_wide_proxy'] Any: ",
                                                                                                                                                                                              "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                              "rule_fqdn"
                                                                                                                                                                                                "ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.report",
                                                                                                                                                                                              "type" "skip"} {"details"
                                                                                                                                                                                                                      "All: ['ccx_ocp_core.utils.affected_version.ensure_is_affected_condition.<locals>.version_condition', 'ccx_rules_ocp.external.bug_rules.bug_1798049.is_CVO_panic'] Any: ",
                                                                                                                                                                                                                    "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                    "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1798049.report",
                                                                                                                                                                                                                    "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                                                                                                                                                                                                                                          "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                          "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1801300.report",
                                                                                                                                                                                                                                          "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                                                                                                                                                                                                                                                                "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1802248.report",
                                                                                                                                                                                                                                                                "type" "skip"} {"details"
                                                                                                                                                                                                                                                                                        "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                                                                      "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                      "rule_fqdn"
                                                                                                                                                                                                                                                                                        "ccx_rules_ocp.external.rules.image_registry_pv_no_access.report",
                                                                                                                                                                                                                                                                                      "type" "skip"} {"details"
                                                                                                                                                                                                                                                                                                              "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                                                                                            "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                            "rule_fqdn"
                                                                                                                                                                                                                                                                                                              "ccx_rules_ocp.external.rules.image_registry_pv_low_capacity.report",
                                                                                                                                                                                                                                                                                                            "type" "skip"} {"details"
                                                                                                                                                                                                                                                                                                                                    "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodEmptyDirVolume', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodPersistentVolume'] Any: ",
                                                                                                                                                                                                                                                                                                                                  "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                                                  "rule_fqdn"
                                                                                                                                                                                                                                                                                                                                    "ccx_rules_ocp.external.rules.image_registry_no_volume_set_check.report",
                                                                                                                                                                                                                                                                                                                                  "type" "skip"} {"details"
                                                                                                                                                                                                                                                                                                                                                          "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                                                                                                                                        "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                                                                        "rule_fqdn"
                                                                                                                                                                                                                                                                                                                                                          "ccx_rules_ocp.external.rules.image_registry_pv_not_bound.report",
                                                                                                                                                                                                                                                                                                                                                        "type" "skip"}],
    "system" {"hostname" nil, "metadata" {}}}}
