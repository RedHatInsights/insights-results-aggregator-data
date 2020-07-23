{"ClusterName" "5d5892d3-1f74-4ccf-91af-548dfc9767aa",
 "LastChecked" "2020-04-02T09:00:05.268294Z",
 "OrgID" 11789772,
 "Report"
   {"fingerprints" [],
    "info" [],
    "reports"
      [{"component" "ccx_rules_ocp.external.rules.tutorial_rule.report",
              "details" {"error_key" "TUTORIAL_ERROR", "type" "rule"},
              "key" "TUTORIAL_ERROR",
              "links" {},
              "rule_id" "tutorial_rule|TUTORIAL_ERROR",
              "tags" [],
              "type" "rule"} {"component"
                                      "ccx_rules_ocp.external.rules.nodes_kubelet_version_check.report",
                                    "details"
                                      {"error_key" "NODE_KUBELET_VERSION",
                                       "kcs_link" "https://access.redhat.com/solutions/4602641",
                                       "nodes_with_different_version"
                                         [{"Kubelet Version" "v1.14.6+6ac6aa4b0",
                                                       "Node" "master0",
                                                       "role" "master"} {"Kubelet Version" "v1.14.6+6ac6aa4b0",
                                                                                     "Node" "master1",
                                                                                     "role" "master"} {"Kubelet Version" "v1.14.6+c7d2111b9",
                                                                                                                   "Node" "master2",
                                                                                                                   "role" "master"} {"Kubelet Version" "v1.14.6+888f9c630",
                                                                                                                                                 "Node" "worker0",
                                                                                                                                                 "role" "worker"} {"Kubelet Version" "v1.14.6+888f9c630",
                                                                                                                                                                               "Node" "worker1",
                                                                                                                                                                               "role" "worker"} {"Kubelet Version" "v1.14.6+888f9c630",
                                                                                                                                                                                                             "Node" "worker2",
                                                                                                                                                                                                             "role" "worker"}],
                                       "type" "rule"},
                                    "key" "NODE_KUBELET_VERSION",
                                    "links" {"kcs" ["https://access.redhat.com/solutions/4602641"]},
                                    "rule_id" "nodes_kubelet_version_check|NODE_KUBELET_VERSION",
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
                                                                                                                            "type" "skip"} {"details"
                                                                                                                                                    "All: ['ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.cluster_wide_proxy'] Any: ",
                                                                                                                                                  "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                  "rule_fqdn"
                                                                                                                                                    "ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.report",
                                                                                                                                                  "type" "skip"} {"details"
                                                                                                                                                                          "All: ['ccx_ocp_core.utils.affected_version.ensure_is_affected_condition.<locals>.version_condition'] Any: ",
                                                                                                                                                                        "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                        "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1798049.report",
                                                                                                                                                                        "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                                                                                                                                                                                              "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                              "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1801300.report",
                                                                                                                                                                                              "type" "skip"} {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                                                                                                                                                                                                                    "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                    "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1802248.report",
                                                                                                                                                                                                                    "type" "skip"} {"details"
                                                                                                                                                                                                                                            "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                          "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                          "rule_fqdn"
                                                                                                                                                                                                                                            "ccx_rules_ocp.external.rules.image_registry_pv_no_access.report",
                                                                                                                                                                                                                                          "type" "skip"} {"details"
                                                                                                                                                                                                                                                                  "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                                                "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                "rule_fqdn"
                                                                                                                                                                                                                                                                  "ccx_rules_ocp.external.rules.image_registry_pv_low_capacity.report",
                                                                                                                                                                                                                                                                "type" "skip"} {"details"
                                                                                                                                                                                                                                                                                        "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator'] Any: ",
                                                                                                                                                                                                                                                                                      "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                      "rule_fqdn"
                                                                                                                                                                                                                                                                                        "ccx_rules_ocp.external.rules.image_registry_no_volume_set_check.report",
                                                                                                                                                                                                                                                                                      "type" "skip"} {"details"
                                                                                                                                                                                                                                                                                                              "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                                                                                                                                                                                                                                                                                                            "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                            "rule_fqdn"
                                                                                                                                                                                                                                                                                                              "ccx_rules_ocp.external.rules.image_registry_pv_not_bound.report",
                                                                                                                                                                                                                                                                                                            "type" "skip"}],
    "system" {"hostname" nil, "metadata" {}}}}
