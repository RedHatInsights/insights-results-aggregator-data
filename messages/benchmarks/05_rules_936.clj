{"AccountNumber" 69688334,
 "ClusterName" "e15bf558-8654-4c94-8d71-93c3a3d086ee",
 "LastChecked" "2020-04-02T09:00:05.268294Z",
 "OrgID" 99336196,
 "Report" {"fingerprints" [],
           "info" [],
           "pass" [],
           "reports" [{"component" "ccx_rules_ocp.external.rules.nodes_requirements_check.report",
                       "details" {"error_key" "NODES_MINIMUM_REQUIREMENTS_NOT_MET",
                                  "link" "https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal",
                                  "nodes" [{"memory" 8.16, "memory_req" 16, "name" "foo1", "role" "master"}],
                                  "type" "rule"},
                       "key" "NODES_MINIMUM_REQUIREMENTS_NOT_MET",
                       "links" {"docs" ["https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal"]},
                       "rule_id" "nodes_requirements_check|NODES_MINIMUM_REQUIREMENTS_NOT_MET",
                       "tags" [],
                       "type" "rule"}
                      {"component" "ccx_rules_ocp.external.bug_rules.bug_1766907.report",
                       "details" {"error_key" "BUGZILLA_BUG_1766907", "type" "rule"},
                       "key" "BUGZILLA_BUG_1766907",
                       "links" {"bz" ["https://bugzilla.redhat.com/show_bug.cgi?id=1766907"],
                                "doc" [],
                                "kcs" ["https://access.redhat.com/solutions/4631541"]},
                       "rule_id" "bug_1766907|BUGZILLA_BUG_1766907",
                       "tags" [],
                       "type" "rule"}
                      {"component" "ccx_rules_ocp.external.rules.nodes_kubelet_version_check.report",
                       "details" {"error_key" "NODE_KUBELET_VERSION",
                                  "kcs_link" "https://access.redhat.com/solutions/4602641",
                                  "nodes_with_different_version" [{"Kubelet Version" "v1.14.6+0a21dd3b3",
                                                                   "Node" "oc1",
                                                                   "role" "worker"}
                                                                  {"Kubelet Version" "v1.14.6+0a21dd3b3",
                                                                   "Node" "oc2",
                                                                   "role" "worker"}
                                                                  {"Kubelet Version" "v1.14.6+d39ad8449",
                                                                   "Node" "oc3",
                                                                   "role" "worker"}],
                                  "type" "rule"},
                       "key" "NODE_KUBELET_VERSION",
                       "links" {"kcs" ["https://access.redhat.com/solutions/4602641"]},
                       "rule_id" "nodes_kubelet_version_check|NODE_KUBELET_VERSION",
                       "tags" [],
                       "type" "rule"}
                      {"component" "ccx_rules_ocp.external.rules.samples_op_failed_image_import_check.report",
                       "details" {"error_key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                                  "info" {"condition" "Degraded",
                                          "lastTransitionTime" "2020-03-19T08:32:53Z",
                                          "message" "Samples installed at 4.2.0, with image import failures for these imagestreams: php ",
                                          "name" "openshift-samples",
                                          "reason" "FailedImageImports"},
                                  "kcs" "https://access.redhat.com/solutions/4563171",
                                  "type" "rule"},
                       "key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                       "links" {"kcs" ["https://access.redhat.com/solutions/4563171"]},
                       "rule_id" "samples_op_failed_image_import_check|SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                       "tags" [],
                       "type" "rule"}
                      {"component" "ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.report",
                       "details" {"error_key" "AUTH_OPERATOR_PROXY_ERROR",
                                  "kcs" "https://access.redhat.com/solutions/4569191",
                                  "op" {"available" {"last_trans_time" "2020-03-31T08:39:51Z",
                                                     "message" nil,
                                                     "reason" "NoData",
                                                     "status" nil},
                                        "degraded" {"last_trans_time" "2020-03-31T08:42:33Z",
                                                    "message" "WellKnownEndpointDegraded: failed to GET well-known https://10.237.112.145:6443/.well-known/oauth-authorization-server: Tunnel or SSL Forbidden",
                                                    "reason" "WellKnownEndpointDegradedError",
                                                    "status" true},
                                        "name" "authentication",
                                        "progressing" {"last_trans_time" "2020-03-31T08:39:51Z",
                                                       "message" nil,
                                                       "reason" "NoData",
                                                       "status" nil},
                                        "upgradeable" {"last_trans_time" "2020-03-31T08:39:51Z",
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
           "skips" [{"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.ocs.check_ocs_version.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.PodsMGOCS'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.ocs.check_pods_scc.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.OperatorsOcsMGOCS'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.ocs.operator_phase_check.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.specs.must_gather_ocs.PersistentVolumeClaimsMGOCS'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.ocs.pvc_phase_check.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.get_mon_reporting_clock_skew'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.ocs.ceph_check_mon_clock_skew.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1801300.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.specs.must_gather.DeploymentsMG'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1802248.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_pv_no_access.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_pv_low_capacity.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodEmptyDirVolume', 'ccx_rules_ocp.common.conditions.image_registry.isImageRegistryPodPersistentVolume'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_no_volume_set_check.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.common.conditions.image_registry.DegradedImageRegistryOperator', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPod', 'ccx_rules_ocp.common.conditions.image_registry.ImageRegistryPersistentVolumeClaim'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.image_registry_pv_not_bound.report",
                     "type" "skip"}],
           "system" {"hostname" nil, "metadata" {}}},
 "Version" 2}
