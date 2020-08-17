{"ClusterName" "5d5892d3-1f74-4ccf-91af-548dfc9767aa",
 "LastChecked" "2020-04-02T09:00:05.268294Z",
 "OrgID" 11789772,
 "Report"
   {"fingerprints" [],
    "info" [],
    "pass" [],
    "reports"
      [{"component" "ccx_rules_ocp.external.bug_rules.bug_1766907.report",
              "details" {"error_key" "BUGZILLA_BUG_1766907", "type" "rule"},
              "key" "BUGZILLA_BUG_1766907",
              "links" {"bz" ["https://bugzilla.redhat.com/show_bug.cgi?id=1766907"],
                       "doc" [],
                       "kcs" ["https://access.redhat.com/solutions/4631541"]},
              "rule_id" "bug_1766907|BUGZILLA_BUG_1766907",
              "tags" [],
              "type" "rule"} {"component"
                                      "ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.report",
                                    "details"
                                      {"error_key" "AUTH_OPERATOR_PROXY_ERROR",
                                       "kcs" "https://access.redhat.com/solutions/4569191",
                                       "op"
                                         {"available" {"last_trans_time" "2020-03-31T05:10:55Z",
                                                       "message" nil,
                                                       "reason" "NoData",
                                                       "status" nil},
                                          "degraded"
                                            {"last_trans_time" "2020-03-31T08:19:48Z",
                                             "message"
                                               "WellKnownEndpointDegraded: failed to GET well-known https://10.237.112.125:6443/.well-known/oauth-authorization-server: Tunnel or SSL Forbidden",
                                             "reason" "WellKnownEndpointDegradedError",
                                             "status" true},
                                          "name" "authentication",
                                          "progressing" {"last_trans_time" "2020-03-31T05:10:55Z",
                                                         "message" nil,
                                                         "reason" "NoData",
                                                         "status" nil},
                                          "upgradeable" {"last_trans_time" "2020-03-31T05:10:55Z",
                                                         "message" nil,
                                                         "reason" "AsExpected",
                                                         "status" true},
                                          "version" nil},
                                       "type" "rule"},
                                    "key" "AUTH_OPERATOR_PROXY_ERROR",
                                    "links" {"kcs" ["https://access.redhat.com/solutions/4569191"]},
                                    "rule_id" "cluster_wide_proxy_auth_check|AUTH_OPERATOR_PROXY_ERROR",
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
                                                                                                      "type" "skip"} {"details" "All: ['ccx_ocp_core.models.nodes.Nodes'] Any: ",
                                                                                                                            "reason" "MISSING_REQUIREMENTS",
                                                                                                                            "rule_fqdn"
                                                                                                                              "ccx_rules_ocp.external.rules.nodes_kubelet_version_check.report",
                                                                                                                            "type" "skip"} {"details" "All: ['ccx_ocp_core.models.nodes.Nodes'] Any: ",
                                                                                                                                                  "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                  "rule_fqdn"
                                                                                                                                                    "ccx_rules_ocp.external.rules.nodes_requirements_check.report",
                                                                                                                                                  "type" "skip"} {"details"
                                                                                                                                                                          "All: ['ccx_rules_ocp.external.bug_rules.bug_1798049.is_CVO_panic'] Any: ",
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
