{"ClusterName" "5d5892d3-1f74-4ccf-91af-548dfc9767aa",
 "LastChecked" "2020-04-02T09:00:05.268294Z",
 "OrgID" 11789772,
 "Report" {"fingerprints" [],
           "info" [],
           "pass" [],
           "reports" [{"component" "ccx_rules_ocp.external.rules.tutorial_rule.report",
                       "details" {"error_key" "TUTORIAL_ERROR", "type" "rule"},
                       "key" "TUTORIAL_ERROR",
                       "links" {},
                       "rule_id" "tutorial_rule|TUTORIAL_ERROR",
                       "tags" [],
                       "type" "rule"}
                      {"component" "ccx_rules_ocp.external.rules.nodes_requirements_check.report",
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
 "acmaunbubx" {"aviswvpnq7" "h|>S'n1Pmpt>o|Md*PAE",
               "d8en1gbl3w" {"ccqvhctg4x" "ldQ?Z7&7:4\"]Q1;R~1:,",
                             "itw15pn9mt" 69528,
                             "nzkiejf54b" 59877,
                             "p03tq06k3m" "w:#!3zYC>v3&CsCcXUGW",
                             "qcl7osucqm" "rR!wQy58Jy4)_]Q>HxD7"},
               "df9gi80z9x" {"c17093k3pv" "m}#I`D^x(#z-=s\\p@4Q0",
                             "ecua3gg821" 55836,
                             "h8jco6hc6x" "c~>j!7Zdm3\\T+dkO*IQR",
                             "s0e82w1f69" "l(%HOP<a8:^BM=RT`eDa",
                             "v2vy38k7go" "n>:<4fU4F,c;D^Z{@tfl"},
               "ehwjz5zd3q" 74192,
               "kxua51sgmi" 86226},
 "h5w64mg8m3" {"jaxt4hzoj6" [76282.34239881726 "kJ)inh#ynOw(a>~E\\We$" 35642 34294.91954876328 true],
               "lep9ljkon0" [8928 74487 51943.555632334435 false true],
               "qk5bj4odz6" {"d3renyojjw" 34522,
                             "d9cxh0ekzt" "q`X=*gmdC%_g4SV9\\[X=",
                             "kojrav5n6q" 9276,
                             "p2m4pzcxh9" "r:/v6:4=leR*7!(Vok^m",
                             "vdaddcmrky" "zOG5i<~InCbK4Gk2U`5L"},
               "t6fwnrynw7" [90734 82006 "o{QU>BKD@!cYVv116gFY" 95000.62178979738 false],
               "zp3fwrnad8" [false "s/CnH%,JB<rd#@h#a3mi" false "kyO/0E37g:6oP3qi/'`R" 16917.541282512895]},
 "iud1567cew" "mio>b_j01R&(%hmWNJZ}"}
