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
                      {"component" "ccx_rules_ocp.external.rules.samples_op_failed_image_import_check.report",
                       "details" {"error_key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                                  "info" {"condition" "Degraded",
                                          "lastTransitionTime" "2020-03-31T18:31:33Z",
                                          "message" "Samples installed at 4.2.5, with image import failures for these imagestreams: fuse-apicurito-generator jboss-amq-63 rhpam73-businesscentral-openshift perl fuse7-java-openshift jenkins jboss-webserver31-tomcat8-openshift jboss-eap72-openshift apicurito-ui fuse7-eap-openshift python mariadb php jboss-webserver30-tomcat7-openshift jboss-datagrid71-openshift jenkins-agent-nodejs jboss-eap70-openshift golang jboss-datagrid72-openshift jboss-fuse70-console jenkins-agent-maven redhat-sso73-openshift ruby redhat-sso71-openshift jboss-datavirt64-driver-openshift dotnet rhpam73-businesscentral-indexing-openshift redis eap-cd-openshift rhpam73-businesscentral-monitoring-openshift fis-java-openshift redhat-openjdk18-openshift jboss-amq-62 rhpam73-kieserver-openshift dotnet-runtime jboss-datagrid65-openshift rhpam73-smartrouter-openshift rhdm73-decisioncentral-indexing-openshift mongodb jboss-fuse70-java-openshift jboss-fuse70-eap-openshift nodejs java jboss-datagrid73-openshift jboss-processserver64-openshift httpd mysql fuse7-console modern-webapp jboss-eap71-openshift jboss-datavirt64-openshift jboss-datagrid65-client-openshift nginx rhdm73-optaweb-employee-rostering-openshift apicast-gateway fuse7-karaf-openshift postgresql fis-karaf-openshift jboss-datagrid71-client-openshift jboss-eap64-openshift redhat-sso70-openshift redhat-sso72-openshift jboss-decisionserver64-openshift openjdk-11-rhel7 rhdm73-decisioncentral-openshift jboss-fuse70-karaf-openshift jboss-webserver31-tomcat7-openshift rhdm73-kieserver-openshift jboss-webserver50-tomcat9-openshift jboss-webserver30-tomcat8-openshift ; last import attempt 2020-03-31 18:31:30 +0000 UTC",
                                          "name" "openshift-samples",
                                          "reason" "FailedImageImports"},
                                  "kcs" "https://access.redhat.com/solutions/4563171",
                                  "type" "rule"},
                       "key" "SAMPLES_FAILED_IMAGE_IMPORT_ERR",
                       "links" {"kcs" ["https://access.redhat.com/solutions/4563171"]},
                       "rule_id" "samples_op_failed_image_import_check|SAMPLES_FAILED_IMAGE_IMPORT_ERR",
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
                    {"details" "All: ['ccx_ocp_core.models.proxy.Proxy'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1766907.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.models.nodes.Nodes'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.nodes_kubelet_version_check.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.models.nodes.Nodes'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.nodes_requirements_check.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.cluster_wide_proxy'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.report",
                     "type" "skip"}
                    {"details" "All: ['ccx_ocp_core.utils.affected_version.ensure_is_affected_condition.<locals>.version_condition', 'ccx_rules_ocp.external.bug_rules.bug_1798049.is_CVO_panic'] Any: ",
                     "reason" "MISSING_REQUIREMENTS",
                     "rule_fqdn" "ccx_rules_ocp.external.bug_rules.bug_1798049.report",
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
           "system" {"hostname" nil, "metadata" {}}}}
