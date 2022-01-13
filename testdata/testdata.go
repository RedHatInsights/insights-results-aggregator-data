// Copyright 2020 Red Hat, Inc
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package testdata

import (
	"encoding/json"
	"fmt"
	"math/rand"
	"time"

	"github.com/google/uuid"

	"github.com/RedHatInsights/insights-operator-utils/generators"
	"github.com/RedHatInsights/insights-operator-utils/tests/helpers"
	utypes "github.com/RedHatInsights/insights-operator-utils/types"
	types "github.com/RedHatInsights/insights-results-types"
)

const (
	// OrgID represents ID of the first organization in the system (ID=1)
	OrgID = types.OrgID(1)

	// Org2ID represents ID of the second organization in the system (ID=2)
	Org2ID = types.OrgID(2)

	// ClusterName represents ID of cluster that belongs to known organization
	ClusterName        = types.ClusterName("84f7eedc-0dd8-49cd-9d4d-f6646df3a5bc")
	UserID             = types.UserID("1")
	User2ID            = types.UserID("2")
	BadClusterName     = types.ClusterName("aaaa")
	Rule1ID            = types.RuleID("ccx_rules_ocp.external.rules.node_installer_degraded")
	BadRuleID          = types.RuleID("rule id with spaces")
	Rule2ID            = types.RuleID("test.rule2")
	Rule3ID            = types.RuleID("test.rule3")
	Rule4ID            = types.RuleID("test.rule4")
	Rule5ID            = types.RuleID("test.rule5")
	Rule1Name          = "rule 1 name"
	Rule2Name          = "rule 2 name"
	Rule3Name          = "rule 3 name"
	Rule4Name          = "rule 4 name"
	Rule5Name          = "rule 5 name"
	Rule1Generic       = "rule 1 generic"
	Rule2Generic       = "rule 2 generic"
	Rule3Generic       = "rule 3 generic"
	Rule4Generic       = "rule 4 generic"
	Rule5Generic       = "rule 5 generic"
	ErrorKey1          = "ek1"
	ErrorKey2          = "ek2"
	ErrorKey3          = "ek3"
	ErrorKey4          = "ek4"
	ErrorKey5          = "ek5"
	Rule1Description   = "Clusteroperator is degraded when the installer pods are removed too soon during upgrade"
	Rule2Description   = "rule 2 description"
	Rule3Description   = "rule 3 description"
	Rule4Description   = "rule 4 description"
	Rule5Description   = "rule 5 description"
	Rule1CreatedAt     = "2020-03-06T12:00:00Z"
	Rule2CreatedAt     = "1970-01-02T00:00:00Z"
	Rule3CreatedAt     = "1970-01-03T00:00:00Z"
	Rule4CreatedAt     = "1970-01-03T00:00:00Z"
	Rule5CreatedAt     = "1970-01-05T00:00:00Z"
	Rule1Summary       = "rule 1 summary"
	Rule2Summary       = "rule 2 summary"
	Rule3Summary       = "rule 3 summary"
	Rule4Summary       = "rule 4 summary"
	Rule5Summary       = "rule 5 summary"
	Rule1Reason        = "Clusteroperator{{?pydata.degraded_operators.length>1}}s{{?}} degraded with NodeInstallerDegraded in reason:\n\n{{~ pydata.degraded_operators :operator }}\n**Cluster-operator:**  **{{=operator[\"name\"]}}**\n- *Reason:* {{=operator[\"degraded\"][\"reason\"]}}\n- *Message:* {{=operator[\"degraded\"][\"message\"]}}\n- *Last transition*: {{=operator[\"degraded\"][\"last_trans_time\"]}}\n\n{{~}}\n"
	Rule2Reason        = "rule 2 reason"
	Rule3Reason        = "rule 3 reason"
	Rule4Reason        = "rule 4 reason"
	Rule5Reason        = "rule 5 reason"
	Rule1Resolution    = "You may be hitting a [known bug](https://bugzilla.redhat.com/show_bug.cgi?id=1723966) and Red Hat recommends that you complete the following steps:\n\n{{~ pydata.degraded_operators :operator }}\n{{? operator[\"name\"] == \"kube-apiserver\"}}\n- For the **kube-apiserver** clusteroperator do:\n~~~\noc patch kubeapiserver/cluster --type merge -p \"{\\\"spec\\\":{\\\"forceRedeploymentReason\\\":\\\"Forcing new revision with random number $RANDOM to make message unique\\\"}}\"\n~~~\n{{?}}\n{{? operator[\"name\"] == \"kube-controller-manager\"}}\n- For the **kube-controller-manager** clusteroperator do:\n~~~\noc patch kubecontrollermanager/cluster --type merge -p \"{\\\"spec\\\":{\\\"forceRedeploymentReason\\\":\\\"Forcing new revision with random number $RANDOM to make message unique\\\"}}\"\n~~~\n{{?}}\n{{? operator[\"name\"] == \"kube-scheduler\"}}\n- For the **kube-scheduler** clusteroperator do:\n~~~\noc patch kubescheduler/cluster --type merge -p \"{\\\"spec\\\":{\\\"forceRedeploymentReason\\\":\\\"Forcing new revision with random number $RANDOM to make message unique\\\"}}\"\n~~~\n{{?}}\nThen wait several minutes and check if the operator is no longer degraded or progressing. If it is still degraded and the same error message is shown, retry (the race condition can be triggered again). If the error message is different or some retries do not make any improvement, open a support case to get further assistance.\n\nIf this solution solves your issue, but you are interested in tracking the definitive resolution of the bug, you can open a support case to do that as well.\n{{~}}"
	Rule2Resolution    = "rule 2 resolution"
	Rule3Resolution    = "rule 3 resolution"
	Rule4Resolution    = "rule 4 resolution"
	Rule5Resolution    = "rule 5 resolution"
	Rule1Disabled      = false
	Rule2Disabled      = false
	Rule3Disabled      = false
	Rule4Disabled      = false
	Rule5Disabled      = true
	KafkaOffset        = types.KafkaOffset(1)
	TestRequestID      = types.RequestID("example12345678/requestID")
	ClusterReportEmpty = types.ClusterReport("{}")
)

var (
	// RuleCompositeIDs are in a `rule.module|ERROR_KEY` format
	Rule1CompositeID, _ = generators.GenerateCompositeRuleID(utypes.RuleFQDN(Rule1ID), utypes.ErrorKey(ErrorKey1))
	Rule2CompositeID, _ = generators.GenerateCompositeRuleID(utypes.RuleFQDN(Rule2ID), utypes.ErrorKey(ErrorKey2))
	Rule3CompositeID, _ = generators.GenerateCompositeRuleID(utypes.RuleFQDN(Rule3ID), utypes.ErrorKey(ErrorKey3))
	Rule4CompositeID, _ = generators.GenerateCompositeRuleID(utypes.RuleFQDN(Rule4ID), utypes.ErrorKey(ErrorKey4))
	Rule5CompositeID, _ = generators.GenerateCompositeRuleID(utypes.RuleFQDN(Rule5ID), utypes.ErrorKey(ErrorKey5))
	// Rule1 contains metainformation about rule with key NODE_INSTALLER_DEGRADED
	Rule1 = types.Rule{
		Module:     Rule1ID,
		Name:       Rule1Name,
		Generic:    Rule1Generic,
		Summary:    Rule1Summary,
		Reason:     Rule1Reason,
		Resolution: Rule1Resolution,
		MoreInfo:   Rule1MoreInfo,
	}
	// Rule2 contains metainformation about rule with simple reason (regular data)
	Rule2 = types.Rule{
		Module:     Rule2ID,
		Name:       Rule2Name,
		Generic:    Rule2Generic,
		Summary:    Rule2Summary,
		Reason:     Rule2Reason,
		Resolution: Rule2Resolution,
		MoreInfo:   Rule2MoreInfo,
	}
	// Rule3 cointains metainformation about rule with simple reason (regular data)
	Rule3 = types.Rule{
		Module:     Rule3ID,
		Name:       Rule3Name,
		Generic:    Rule3Generic,
		Summary:    Rule3Summary,
		Reason:     Rule3Reason,
		Resolution: Rule3Resolution,
		MoreInfo:   Rule3MoreInfo,
	}
	// Rule4 contains metainformation about rule with simple reason (regular data)
	Rule4 = types.Rule{
		Module:     Rule4ID,
		Name:       Rule4Name,
		Generic:    Rule4Generic,
		Summary:    Rule4Summary,
		Reason:     Rule4Reason,
		Resolution: Rule4Resolution,
		MoreInfo:   Rule4MoreInfo,
	}
	// Rule5 contains metainformation about rule with simple reason (regular data)
	Rule5 = types.Rule{
		Module:     Rule5ID,
		Name:       Rule5Name,
		Generic:    Rule5Generic,
		Summary:    Rule5Summary,
		Reason:     Rule5Reason,
		Resolution: Rule5Resolution,
		MoreInfo:   Rule5MoreInfo,
	}
	RuleOnReport1 = types.RuleOnReport{
		Module:          Rule1.Module,
		ErrorKey:        RuleErrorKey1.ErrorKey,
		UserVote:        types.UserVoteNone,
		Disabled:        Rule1Disabled,
		DisableFeedback: "",
		DisabledAt:      "",
		TemplateData:    Rule1ExtraData,
	}
	RuleOnReport2 = types.RuleOnReport{
		Module:          Rule2.Module,
		ErrorKey:        RuleErrorKey2.ErrorKey,
		UserVote:        types.UserVoteNone,
		Disabled:        Rule2Disabled,
		DisableFeedback: "",
		DisabledAt:      "",
		TemplateData:    Rule2ExtraData,
	}
	RuleOnReport3 = types.RuleOnReport{
		Module:          Rule3.Module,
		ErrorKey:        RuleErrorKey3.ErrorKey,
		UserVote:        types.UserVoteNone,
		Disabled:        Rule3Disabled,
		DisableFeedback: "",
		DisabledAt:      "",
		TemplateData:    Rule3ExtraData,
	}
	RuleOnReport4 = types.RuleOnReport{
		Module:          Rule4.Module,
		ErrorKey:        RuleErrorKey4.ErrorKey,
		UserVote:        types.UserVoteNone,
		Disabled:        Rule4Disabled,
		DisableFeedback: "",
		DisabledAt:      "",
		TemplateData:    Rule4ExtraData,
	}
	RuleOnReport5 = types.RuleOnReport{
		Module:          Rule5.Module,
		ErrorKey:        RuleErrorKey5.ErrorKey,
		UserVote:        types.UserVoteNone,
		Disabled:        Rule5Disabled,
		DisableFeedback: "",
		DisabledAt:      "",
		TemplateData:    Rule5ExtraData,
	}
	RuleContent1 = types.RuleContent{
		Summary:    Rule1.Summary,
		Generic:    Rule1.Generic,
		Reason:     Rule1.Reason,
		Resolution: Rule1.Resolution,
		MoreInfo:   Rule1.MoreInfo,
		Plugin: types.RulePluginInfo{
			Name:         Rule1.Name,
			NodeID:       "",
			ProductCode:  "",
			PythonModule: string(Rule1.Module),
		},
		ErrorKeys: map[string]types.RuleErrorKeyContent{
			ErrorKey1: {
				Generic:    RuleErrorKey1.Generic,
				Summary:    RuleErrorKey1.Summary,
				Reason:     RuleErrorKey1.Reason,
				Resolution: RuleErrorKey1.Resolution,
				MoreInfo:   RuleErrorKey1.MoreInfo,
				TotalRisk:  (RuleErrorKey1.Impact + RuleErrorKey1.Likelihood) / 2,
				Metadata: types.ErrorKeyMetadata{
					Description: RuleErrorKey1.Description,
					Impact: types.Impact{
						Impact: RuleErrorKey1.Impact,
						Name:   "test_impact",
					},
					Likelihood:  RuleErrorKey1.Likelihood,
					PublishDate: timeToStr(RuleErrorKey1.PublishDate),
					Status:      statusToStr(RuleErrorKey1.Active),
					Tags:        RuleErrorKey1.Tags,
				},
			},
		},
	}
	RuleContent2 = types.RuleContent{
		Summary:    Rule2.Summary,
		Generic:    Rule2.Generic,
		Reason:     Rule2.Reason,
		Resolution: Rule2.Resolution,
		MoreInfo:   Rule2.MoreInfo,
		Plugin: types.RulePluginInfo{
			Name:         Rule2.Name,
			NodeID:       "",
			ProductCode:  "",
			PythonModule: string(Rule2.Module),
		},
		ErrorKeys: map[string]types.RuleErrorKeyContent{
			ErrorKey2: {
				Generic:    RuleErrorKey2.Generic,
				Summary:    RuleErrorKey2.Summary,
				Reason:     RuleErrorKey2.Reason,
				Resolution: RuleErrorKey2.Resolution,
				MoreInfo:   RuleErrorKey2.MoreInfo,
				TotalRisk:  (RuleErrorKey2.Impact + RuleErrorKey2.Likelihood) / 2,
				Metadata: types.ErrorKeyMetadata{
					Description: RuleErrorKey2.Description,
					Impact: types.Impact{
						Impact: RuleErrorKey2.Impact,
						Name:   "test_impact",
					},
					Likelihood:  RuleErrorKey2.Likelihood,
					PublishDate: timeToStr(RuleErrorKey2.PublishDate),
					Status:      statusToStr(RuleErrorKey2.Active),
					Tags:        RuleErrorKey2.Tags,
				},
			},
		},
	}
	RuleContent3 = types.RuleContent{
		Summary:    Rule3.Summary,
		Generic:    Rule3.Generic,
		Reason:     Rule3.Reason,
		Resolution: Rule3.Resolution,
		MoreInfo:   Rule3.MoreInfo,
		Plugin: types.RulePluginInfo{
			Name:         Rule3.Name,
			NodeID:       "",
			ProductCode:  "",
			PythonModule: string(Rule3.Module),
		},
		ErrorKeys: map[string]types.RuleErrorKeyContent{
			ErrorKey3: {
				Generic:    RuleErrorKey3.Generic,
				Summary:    RuleErrorKey3.Summary,
				Reason:     RuleErrorKey3.Reason,
				Resolution: RuleErrorKey3.Resolution,
				MoreInfo:   RuleErrorKey3.MoreInfo,
				TotalRisk:  (RuleErrorKey3.Impact + RuleErrorKey3.Likelihood) / 2,
				Metadata: types.ErrorKeyMetadata{
					Description: RuleErrorKey3.Description,
					Impact: types.Impact{
						Impact: RuleErrorKey3.Impact,
						Name:   "test_impact",
					},
					Likelihood:  RuleErrorKey3.Likelihood,
					PublishDate: timeToStr(RuleErrorKey3.PublishDate),
					Status:      statusToStr(RuleErrorKey3.Active),
					Tags:        RuleErrorKey3.Tags,
				},
			},
		},
	}
	RuleContent4 = types.RuleContent{
		Summary:    Rule4.Summary,
		Generic:    Rule4.Generic,
		Reason:     Rule4.Reason,
		Resolution: Rule4.Resolution,
		MoreInfo:   Rule4.MoreInfo,
		Plugin: types.RulePluginInfo{
			Name:         Rule4.Name,
			NodeID:       "",
			ProductCode:  "",
			PythonModule: string(Rule4.Module),
		},
		ErrorKeys: map[string]types.RuleErrorKeyContent{
			ErrorKey4: {
				Generic:    RuleErrorKey4.Generic,
				Summary:    RuleErrorKey4.Summary,
				Reason:     RuleErrorKey4.Reason,
				Resolution: RuleErrorKey4.Resolution,
				MoreInfo:   RuleErrorKey4.MoreInfo,
				TotalRisk:  (RuleErrorKey4.Impact + RuleErrorKey4.Likelihood) / 2,
				Metadata: types.ErrorKeyMetadata{
					Description: RuleErrorKey4.Description,
					Impact: types.Impact{
						Impact: RuleErrorKey4.Impact,
						Name:   "test_impact",
					},
					Likelihood:  RuleErrorKey4.Likelihood,
					PublishDate: "2019-10-29 15:00:00",
					Status:      statusToStr(RuleErrorKey4.Active),
					Tags:        RuleErrorKey4.Tags,
				},
			},
		},
	}
	RuleContent5 = types.RuleContent{
		Summary:    Rule5.Summary,
		Generic:    Rule5.Generic,
		Reason:     Rule5.Reason,
		Resolution: Rule5.Resolution,
		MoreInfo:   Rule5.MoreInfo,
		Plugin: types.RulePluginInfo{
			Name:         Rule5.Name,
			NodeID:       "",
			ProductCode:  "",
			PythonModule: string(Rule5.Module),
		},
		ErrorKeys: map[string]types.RuleErrorKeyContent{
			ErrorKey5: {
				Generic:    RuleErrorKey5.Generic,
				Summary:    RuleErrorKey5.Summary,
				Reason:     RuleErrorKey5.Reason,
				Resolution: RuleErrorKey5.Resolution,
				MoreInfo:   RuleErrorKey5.MoreInfo,
				TotalRisk:  (RuleErrorKey5.Impact + RuleErrorKey5.Likelihood) / 2,
				Metadata: types.ErrorKeyMetadata{
					Description: RuleErrorKey5.Description,
					Impact: types.Impact{
						Impact: RuleErrorKey5.Impact,
						Name:   "test_impact",
					},
					Likelihood:  RuleErrorKey5.Likelihood,
					PublishDate: timeToStr(RuleErrorKey5.PublishDate),
					Status:      statusToStr(RuleErrorKey5.Active),
					Tags:        RuleErrorKey5.Tags,
				},
			},
		},
	}

	RuleContent1V2 = types.RuleContentV2{
		Summary:    Rule1.Summary,
		Generic:    Rule1.Generic,
		Reason:     Rule1.Reason,
		Resolution: Rule1.Resolution,
		MoreInfo:   Rule1.MoreInfo,
		Plugin: types.RulePluginInfo{
			Name:         Rule1.Name,
			NodeID:       "",
			ProductCode:  "",
			PythonModule: string(Rule1.Module),
		},
		ErrorKeys: map[string]types.RuleErrorKeyContentV2{
			ErrorKey1: {
				Generic:    RuleErrorKey1.Generic,
				Summary:    RuleErrorKey1.Summary,
				Reason:     RuleErrorKey1.Reason,
				Resolution: RuleErrorKey1.Resolution,
				MoreInfo:   RuleErrorKey1.MoreInfo,
				TotalRisk:  (RuleErrorKey1.Impact + RuleErrorKey1.Likelihood) / 2,
				Metadata: types.ErrorKeyMetadataV2{
					Description: RuleErrorKey1.Description,
					Impact:      RuleErrorKey1.Impact,
					Likelihood:  RuleErrorKey1.Likelihood,
					PublishDate: timeToStr(RuleErrorKey1.PublishDate),
					Status:      statusToStr(RuleErrorKey1.Active),
					Tags:        RuleErrorKey1.Tags,
				},
			},
		},
	}

	RuleErrorKey1 = types.RuleErrorKey{
		ErrorKey:    ErrorKey1,
		RuleModule:  Rule1ID,
		Condition:   "condition1",
		Description: "description1",
		Impact:      1,
		Likelihood:  2,
		PublishDate: LastCheckedAt,
		Active:      false,
		Generic:     "generic1",
		Summary:     "summary1",
		Reason:      "reason1",
		Resolution:  "resolution1",
		MoreInfo:    "moreinfo1",
		Tags:        []string{"openshift", "service_availability", "osd_customer"},
	}
	RuleErrorKey2 = types.RuleErrorKey{
		ErrorKey:    ErrorKey2,
		RuleModule:  Rule2ID,
		Condition:   "condition2",
		Description: "description2",
		Impact:      2,
		Likelihood:  3,
		PublishDate: LastCheckedAt,
		Active:      true,
		Generic:     "generic2",
		Summary:     "summary2",
		Reason:      "reason2",
		Resolution:  "resolution2",
		MoreInfo:    "moreinfo2",
	}
	RuleErrorKey3 = types.RuleErrorKey{
		ErrorKey:    ErrorKey3,
		RuleModule:  Rule3ID,
		Condition:   "condition3",
		Description: "description3",
		Impact:      2,
		Likelihood:  3,
		PublishDate: LastCheckedAt,
		Active:      true,
		Generic:     "generic3",
		Summary:     "summary3",
		Reason:      "reason3",
		Resolution:  "resolution3",
		MoreInfo:    "moreinfo3",
		Tags:        []string{},
	}
	RuleErrorKey4 = types.RuleErrorKey{
		ErrorKey:    ErrorKey4,
		RuleModule:  Rule4ID,
		Condition:   "condition1",
		Description: "description1",
		Impact:      1,
		Likelihood:  2,
		PublishDate: LastCheckedAt,
		Active:      false,
		Generic:     "generic4",
		Summary:     "summary4",
		Reason:      "reason4",
		Resolution:  "resolution4",
		MoreInfo:    "moreinfo4",
		Tags:        []string{"openshift", "service_availability"},
	}
	RuleErrorKey5 = types.RuleErrorKey{
		ErrorKey:    ErrorKey5,
		RuleModule:  Rule5ID,
		Condition:   "condition1",
		Description: "description1",
		Impact:      1,
		Likelihood:  2,
		PublishDate: LastCheckedAt,
		Active:      false,
		Generic:     "generic5",
		Summary:     "summary5",
		Reason:      "reason5",
		Resolution:  "resolution5",
		MoreInfo:    "moreinfo5",
		Tags:        []string{"openshift", "service_availability"},
	}
	RuleWithContent1 = types.RuleWithContent{
		Module:      Rule1.Module,
		Name:        Rule1.Name,
		Summary:     RuleErrorKey1.Summary,
		Reason:      RuleErrorKey1.Reason,
		Resolution:  RuleErrorKey1.Resolution,
		MoreInfo:    RuleErrorKey1.MoreInfo,
		ErrorKey:    RuleErrorKey1.ErrorKey,
		Condition:   RuleErrorKey1.Condition,
		Description: RuleErrorKey1.Description,
		TotalRisk:   (RuleErrorKey1.Impact + RuleErrorKey1.Likelihood) / 2,
		PublishDate: RuleErrorKey1.PublishDate,
		Active:      RuleErrorKey1.Active,
		Generic:     RuleErrorKey1.Generic,
		Tags:        []string{},
	}
	RuleWithContent2 = types.RuleWithContent{
		Module:      Rule2.Module,
		Name:        Rule2.Name,
		Summary:     RuleErrorKey2.Summary,
		Reason:      RuleErrorKey2.Reason,
		Resolution:  RuleErrorKey2.Resolution,
		MoreInfo:    RuleErrorKey2.MoreInfo,
		ErrorKey:    RuleErrorKey2.ErrorKey,
		Condition:   RuleErrorKey2.Condition,
		Description: RuleErrorKey2.Description,
		TotalRisk:   (RuleErrorKey2.Impact + RuleErrorKey2.Likelihood) / 2,
		PublishDate: RuleErrorKey2.PublishDate,
		Active:      RuleErrorKey2.Active,
		Generic:     RuleErrorKey2.Generic,
		Tags:        []string{},
	}
	RuleWithContent3 = types.RuleWithContent{
		Module:      Rule3.Module,
		Name:        Rule3.Name,
		Summary:     RuleErrorKey3.Summary,
		Reason:      RuleErrorKey3.Reason,
		Resolution:  RuleErrorKey3.Resolution,
		MoreInfo:    RuleErrorKey3.MoreInfo,
		ErrorKey:    RuleErrorKey3.ErrorKey,
		Condition:   RuleErrorKey3.Condition,
		Description: RuleErrorKey3.Description,
		TotalRisk:   (RuleErrorKey3.Impact + RuleErrorKey3.Likelihood) / 2,
		PublishDate: RuleErrorKey3.PublishDate,
		Active:      RuleErrorKey3.Active,
		Generic:     RuleErrorKey3.Generic,
		Tags:        []string{},
	}
	Rule1MoreInfo  = "More info for rule 1"
	Rule2MoreInfo  = "More info for rule 2"
	Rule3MoreInfo  = "More info for rule 3"
	Rule4MoreInfo  = "More info for rule 4"
	Rule5MoreInfo  = "More info for rule 5"
	Rule1ExtraData = stringToJSONRawMessage(`{
		"degraded_operators": [
			{
				"available": {
					"last_trans_time": "2020-04-21T12:45:10Z",
					"message": "Available: 2 nodes are active; 1 nodes are at revision 0; 2 nodes are at revision 2; 0 nodes have achieved new revision 3",
					"reason": "AsExpected",
					"status": true
				},
				"degraded": {
					"last_trans_time": "2020-04-21T12:46:14Z",
					"message": "NodeControllerDegraded: All master nodes are ready\nStaticPodsDegraded: nodes/ip-10-0-137-172.us-east-2.compute.internal pods/kube-apiserver-ip-10-0-137-172.us-east-2.compute.internal container=\"kube-apiserver-3\" is not ready",
					"reason": "NodeInstallerDegradedInstallerPodFailed",
					"status": true
				},
				"name": "kube-apiserver",
				"progressing": {
					"last_trans_time": "2020-04-21T12:43:00Z",
					"message": "Progressing: 1 nodes are at revision 0; 2 nodes are at revision 2; 0 nodes have achieved new revision 3",
					"reason": null,
					"status": true
				},
				"upgradeable": {
					"last_trans_time": "2020-04-21T12:42:52Z",
					"message": null,
					"reason": "AsExpected",
					"status": true
				},
				"version": "4.3.13"
			}
		],
		"error_key": "NODE_INSTALLER_DEGRADED",
		"type": "rule"
	}`)
	Rule2ExtraData = stringToJSONRawMessage(`{
        "nodes": [
            {
                "name": "foo1",
                "role": "master",
                "memory": 8.16,
                "memory_req": 16
            }
        ],
        "link": "https://docs.openshift.com/container-platform/4.1/installing/installing_bare_metal/installing-bare-metal.html#minimum-resource-requirements_installing-bare-metal",
        "type": "rule",
        "error_key": "NODES_MINIMUM_REQUIREMENTS_NOT_MET"
    }`)
	Rule3ExtraData = stringToJSONRawMessage(`{
	    "type": "rule",
	    "error_key": "BUGZILLA_BUG_1766907"
	}`)
	Rule4ExtraData = stringToJSONRawMessage(`{
        "nodes_with_different_version": [
            {
                "Node": "oc1",
                "Kubelet Version": "v1.14.6+0a21dd3b3",
                "role": "worker"
            },
            {
                "Node": "oc2",
                "Kubelet Version": "v1.14.6+0a21dd3b3",
                "role": "worker"
            },
            {
                "Node": "oc3",
                "Kubelet Version": "v1.14.6+d39ad8449",
                "role": "worker"
            }
        ],
        "kcs_link": "https://access.redhat.com/solutions/4602641",
        "type": "rule",
        "error_key": "NODE_KUBELET_VERSION"
    }`)
	Rule5ExtraData = stringToJSONRawMessage(`{
	    "type": "rule",
	    "error_key": "BUGZILLA_BUG_1766907"
	}`)
	ConsumerReport = `{
		"fingerprints": [],
		"info": [],
		"reports": [],
		"skips": [],
		"system": {}
	}`
	ConsumerMessage = `{
		"OrgID": ` + fmt.Sprint(OrgID) + `,
		"ClusterName": "` + string(ClusterName) + `",
		"Report":` + ConsumerReport + `,
		"LastChecked": "` + LastCheckedAt.UTC().Format(time.RFC3339) + `"
	}`
	LastCheckedAt              = time.Unix(25, 0).UTC()
	RuleContentDirectory3Rules = types.RuleContentDirectory{
		Config: types.GlobalRuleConfig{
			Impact: ImpactStrToInt,
		},
		Rules: map[string]types.RuleContent{
			"rc1": RuleContent1,
			"rc2": RuleContent2,
			"rc3": RuleContent3,
		},
	}
	RuleContentDirectory5Rules = types.RuleContentDirectory{
		Config: types.GlobalRuleConfig{
			Impact: ImpactStrToInt,
		},
		Rules: map[string]types.RuleContent{
			"rc1": RuleContent1,
			"rc2": RuleContent2,
			"rc3": RuleContent3,
			"rc4": RuleContent4,
			"rc5": RuleContent5,
		},
	}

	RuleContentResponses = []types.RuleContentResponse{
		types.RuleContentResponse{
			RuleModule: Rule1ID,
		},
		types.RuleContentResponse{
			RuleModule: Rule2ID,
		},
		types.RuleContentResponse{
			RuleModule: Rule3ID,
		},
	}

	RuleOnReportResponses = []types.RuleOnReport{
		{
			Module:       Rule1ID,
			ErrorKey:     ErrorKey1,
			UserVote:     types.UserVoteNone,
			Disabled:     Rule1Disabled,
			TemplateData: Rule1ExtraData,
		},
		{
			Module:       Rule2ID,
			ErrorKey:     ErrorKey2,
			UserVote:     types.UserVoteNone,
			Disabled:     Rule2Disabled,
			TemplateData: Rule2ExtraData,
		},
		{
			Module:       Rule3ID,
			ErrorKey:     ErrorKey3,
			UserVote:     types.UserVoteNone,
			Disabled:     Rule3Disabled,
			TemplateData: Rule3ExtraData,
		},
	}

	ReportEmptyRulesParsed = []types.ReportItem{}

	Report2RulesParsed = []types.ReportItem{
		types.ReportItem{
			Module:       Rule1ID,
			ErrorKey:     ErrorKey1,
			TemplateData: json.RawMessage(Rule1ExtraData),
		},
		types.ReportItem{
			Module:       Rule2ID,
			ErrorKey:     ErrorKey2,
			TemplateData: json.RawMessage(Rule2ExtraData),
		},
	}

	Report3RulesParsed = []types.ReportItem{
		types.ReportItem{
			Module:       Rule1ID,
			ErrorKey:     ErrorKey1,
			TemplateData: json.RawMessage(Rule1ExtraData),
		},
		types.ReportItem{
			Module:       Rule2ID,
			ErrorKey:     ErrorKey2,
			TemplateData: json.RawMessage(Rule2ExtraData),
		},
		types.ReportItem{
			Module:       Rule3ID,
			ErrorKey:     ErrorKey3,
			TemplateData: json.RawMessage(Rule3ExtraData),
		},
	}

	Report0Rules = types.ClusterReport(`
{
	"system": {
		"metadata": {},
		"hostname": null
	},
	"reports": [],
	"fingerprints": [],
	"skips": [],
	"info": []
}
`)

	Report2Rules = types.ClusterReport(`
{
	"system": {
		"metadata": {},
		"hostname": null
	},
	"reports": [
		{
			"component": "` + string(Rule1ID) + `",
			"key": "` + ErrorKey1 + `",
			"user_vote": 0,
			"disabled": ` + fmt.Sprint(Rule1Disabled) + `,
			"details": ` + helpers.ToJSONString(Rule1ExtraData) + `
		},
		{
			"component": "` + string(Rule2ID) + `",
			"key": "` + ErrorKey2 + `",
			"user_vote": 0,
			"disabled": ` + fmt.Sprint(Rule2Disabled) + `,
			"details": ` + helpers.ToJSONString(Rule2ExtraData) + `
		}
	],
	"fingerprints": [],
	"skips": [],
	"info": []
}
`)

	Report2RulesDisabledRule1ExpectedResponse = `
{
	"report": {
		"meta": {
			"count": 2,
			"last_checked_at": "` + LastCheckedAt.UTC().Format(time.RFC3339) + `"
		},
		"reports": [
			{
				"component": "` + string(Rule2ID) + `",
				"key": "` + ErrorKey2 + `",
				"user_vote": 0,
				"disabled": false,
				"disable_feedback": "",
				"details": ` + helpers.ToJSONString(Rule2ExtraData) + `
			},
			{
				"component": "` + string(Rule1ID) + `",
				"key": "` + ErrorKey1 + `",
				"user_vote": 0,
				"disabled": true,
				"disable_feedback": "",
				"details": ` + helpers.ToJSONString(Rule1ExtraData) + `
			}
		]
	},
	"status": "ok"
}
`

	Report2RulesDisabledRule1WithFeedbackExpectedResponse = `
{
	"report": {
		"meta": {
			"count": 2,
			"last_checked_at": "` + LastCheckedAt.UTC().Format(time.RFC3339) + `"
		},
		"reports": [
			{
				"component": "` + string(Rule2ID) + `",
				"key": "` + ErrorKey2 + `",
				"user_vote": 0,
				"disabled": false,
				"disabled_at": "",
				"disable_feedback": "",
				"details": ` + helpers.ToJSONString(Rule2ExtraData) + `
			},
			{
				"component": "` + string(Rule1ID) + `",
				"key": "` + ErrorKey1 + `",
				"user_vote": 0,
				"disabled": true,
				"disabled_at": "",
				"disable_feedback": "test",
				"details": ` + helpers.ToJSONString(Rule1ExtraData) + `
			}
		]
	},
	"status": "ok"
}
`

	Report2RulesDisabledExpectedResponse = `
{
	"report": {
		"meta": {
			"count": 2,
			"last_checked_at": "` + LastCheckedAt.UTC().Format(time.RFC3339) + `"
		},
		"reports": [
			{
				"component": "` + string(Rule1ID) + `",
				"key": "` + ErrorKey1 + `",
				"user_vote": 0,
				"disabled": true,
				"details": ` + helpers.ToJSONString(Rule1ExtraData) + `
			},
			{
				"component": "` + string(Rule2ID) + `",
				"key": "` + ErrorKey2 + `",
				"user_vote": 0,
				"disabled": true,
				"details": ` + helpers.ToJSONString(Rule2ExtraData) + `
			}
		]
	},
	"status": "ok"
}
`

	Report2RulesEnabledRulesExpectedResponse = `
{
	"report": {
		"meta": {
			"count": 2,
			"last_checked_at": "` + LastCheckedAt.UTC().Format(time.RFC3339) + `"
		},
		"reports": [
			{
				"component": "` + string(Rule1ID) + `",
				"key": "` + ErrorKey1 + `",
				"user_vote": 0,
				"disabled": ` + fmt.Sprint(Rule1Disabled) + `,
				"details": ` + helpers.ToJSONString(Rule1ExtraData) + `
			},
			{
				"component": "` + string(Rule2ID) + `",
				"key": "` + ErrorKey2 + `",
				"user_vote": 0,
				"disabled": ` + fmt.Sprint(Rule2Disabled) + `,
				"details": ` + helpers.ToJSONString(Rule2ExtraData) + `
			}
		]
	},
	"status": "ok"
}
`

	ClusterReport3Rules = types.ClusterReport(`
{
	"reports": [
		{
			"rule_id": "` + string(Rule1ID) + "|" + ErrorKey1 + `",
			"component": "` + string(Rule1ID) + `",
			"type": "rule",
			"key": "` + ErrorKey1 + `",
			"details": ` + toJSON(Rule1ExtraData) + `,
			"tags": [],
			"links": {}
		},
		{
			"rule_id": "` + string(Rule2ID) + "|" + ErrorKey2 + `",
			"component": "` + string(Rule2ID) + `",
			"type": "rule",
			"key": "` + ErrorKey2 + `",
			"details": ` + toJSON(Rule2ExtraData) + `,
			"tags": [],
			"links": {}
		},
		{
			"rule_id": "` + string(Rule3ID) + "|" + ErrorKey3 + `",
			"component": "` + string(Rule3ID) + `",
			"type": "rule",
			"key": "` + ErrorKey3 + `",
			"details": ` + toJSON(Rule3ExtraData) + `,
			"tags": [],
			"links": {}
		}
	]
}
	`)

	// Report3Rules represents a synthesized and modified cluster report
	// TODO: it's not a correct structure of a cluster report, it can't contain user_vote and disabled fields
	Report3Rules = types.ClusterReport(`
{
	"system": {
		"metadata": {},
		"hostname": null
	},
	"reports": [
		{
			"component": "` + string(Rule1ID) + `",
			"key": "` + ErrorKey1 + `",
			"user_vote": 0,
			"disabled": ` + fmt.Sprint(Rule1Disabled) + `,
			"details": ` + helpers.ToJSONString(Rule1ExtraData) + `
		},
		{
			"component": "` + string(Rule2ID) + `",
			"key": "` + ErrorKey2 + `",
			"user_vote": 0,
			"disabled": ` + fmt.Sprint(Rule2Disabled) + `,
			"details": ` + helpers.ToJSONString(Rule2ExtraData) + `
		},
		{
			"component": "` + string(Rule3ID) + `",
			"key": "` + ErrorKey3 + `",
			"user_vote": 0,
			"disabled": ` + fmt.Sprint(Rule3Disabled) + `,
			"details": ` + helpers.ToJSONString(Rule3ExtraData) + `
		}
	],
	"fingerprints": [],
	"skips": [],
	"info": []
}
`)

	// Report1RuleExpectedResponse  is an example of response sent by insights-results-aggregator
	Report1RuleExpectedResponse = `
		{
			"report": {
				"meta": {
					"count": 1,
					"last_checked_at": "` + LastCheckedAt.UTC().Format(time.RFC3339) + `"
				},
				"reports": [
					` + toJSON(RuleOnReport4) + `
				]
			},
			"status": "ok"
		}
	`
	// Report3RulesExpectedResponse  is an example of response sent by insights-results-aggregator
	Report3RulesExpectedResponse = `
		{
			"report": {
				"meta": {
					"count": 3,
					"last_checked_at": "` + LastCheckedAt.UTC().Format(time.RFC3339) + `"
				},
				"reports": [
					` + toJSON(RuleOnReport1) + `,
					` + toJSON(RuleOnReport2) + `,
					` + toJSON(RuleOnReport3) + `
				]
			},
			"status": "ok"
		}
	`
	Report3RulesProxyExpectedResponse = `
		{
		  "report": {
			"meta": {
			  "count": 3,
			  "last_checked_at": "` + LastCheckedAt.UTC().Format(time.RFC3339) + `"
			},
			"data": [
				` + toJSON(RuleWithContent1) + `,
				` + toJSON(RuleWithContent2) + `,
				` + toJSON(RuleWithContent3) + `,
			]
		  },
		  "status": "ok"
		}
	`
	Report3SingleRuleExpectedResponse = `
		{
			"report": ` + toJSON(RuleOnReport1) + `,
			"status": "ok"
		}
	`

	Report3SingleRule2ExpectedResponse = `
		{
			"report": ` + toJSON(RuleOnReport2) + `,
			"status": "ok"
		}
	`

	Report3Rules1DisabledExpectedResponse = `
		{
			"report": {
				"meta": {
					"count": 3,
					"last_checked_at": "` + LastCheckedAt.UTC().Format(time.RFC3339) + `"
				},
				"reports": [
					` + toJSON(RuleOnReport1) + `,
					` + toJSON(RuleOnReport2) + `,
					` + toJSON(RuleOnReport5) + `
				]
			},
			"status": "ok"
		}
	`

	ImpactStrToInt = map[string]int{
		"Zero":  0,
		"One":   1,
		"Two":   2,
		"Three": 3,
		"Four":  4,
		"Five":  5,
		"Six":   6,
		"Seven": 7,
		"Eight": 8,
		"Nine":  9,
	}
	ImpactIntToStr = []string{
		"Zero",
		"One",
		"Two",
		"Three",
		"Four",
		"Five",
		"Six",
		"Seven",
		"Eight",
		"Nine",
	}
	ResponseNoRulesDisabledSystemWide = `{
		"meta": {
			"count": 0
		},
		"data": []
	}`

	ResponseRule1DisabledSystemWide = struct {
		Status string                             `json:"status"`
		RuleDisable []types.SystemWideRuleDisable `json:"disabledRules"`
	}{
		Status: "ok",
		RuleDisable: []types.SystemWideRuleDisable{
			{
				OrgID:         OrgID,
				UserID:        UserID,
				RuleID:        Rule1ID,
				ErrorKey:      ErrorKey1,
				Justification: "Rule 1 disabled for testing purposes",
			},
		},
	}

	ResponseRule2DisabledSystemWide = struct {
		Status string                             `json:"status"`
		RuleDisable []types.SystemWideRuleDisable `json:"disabledRules"`
	}{
		Status: "ok",
		RuleDisable: []types.SystemWideRuleDisable{
			{
				OrgID:         OrgID,
				UserID:        UserID,
				RuleID:        Rule2ID,
				ErrorKey:      ErrorKey2,
				Justification: "Rule 2 disabled for testing purposes",
			},
		},
	}
)

func timeToStr(t time.Time) string {
	return t.UTC().Format(time.RFC3339)
}

func statusToStr(status bool) string {
	if status {
		return "active"
	}

	return "inactive"
}

// GetRandomConsumerMessage function returns a generated message for random
// organization ID, random cluster name and randomly generated timestamp
// (LastCheckedAt)
func GetRandomConsumerMessage() string {
	// disable Use of weak random number generator for the whole method
	/* #nosec G404 */
	orgID := rand.Intn(999999)
	clusterName := uuid.New()
	timeRandomRange := 100000
	/* #nosec G404 */
	lastCheckedAt := time.Now().Add(-time.Duration(rand.Intn(timeRandomRange)) * time.Second)
	// TODO: generate some real looking consumer report here
	consumerReport := ConsumerReport

	consumerMessage := `{
		    "OrgID": ` + fmt.Sprint(orgID) + `,
		    "ClusterName": "` + clusterName.String() + `",
		    "Report":` + consumerReport + `,
		    "LastChecked": "` + lastCheckedAt.UTC().Format(time.RFC3339) + `"
	    }`

	return consumerMessage
}

// GetRandomRuleID function returns randomly generated rule ID, which is a
// sequence of lowercase ASCII characters.
func GetRandomRuleID(length uint) types.RuleID {
	// disable Use of weak random number generator for the whole method
	/* #nosec G404 */
	var result types.RuleID

	for i := uint(0); i < length; i++ {
		/* #nosec G404 */
		char := rune('a' + rand.Intn('z'-'a'))
		result += types.RuleID(char)
	}

	return result
}

// GetRandomUserID function returns randomly generated user ID, which is
// non-negative integer in a range 0..999999.
func GetRandomUserID() types.UserID {
	// disable Use of weak random number generator for the whole method
	/* #nosec G404 */
	return types.UserID(fmt.Sprint(rand.Intn(999999)))
}

// GetRandomOrgID function returns randomly generated organization ID in range
// 0..999999
func GetRandomOrgID() types.OrgID {
	// disable Use of weak random number generator for the whole method
	/* #nosec G404 */
	return types.OrgID(rand.Intn(999999))
}

// GetRandomClusterID function returns randomly generated cluster ID, which
// might look like a regular UUID.
func GetRandomClusterID() types.ClusterName {
	return types.ClusterName(uuid.New().String())
}

// TODO: move to utils
func toJSON(obj interface{}) string {
	jsonBytes, err := json.MarshalIndent(obj, "", "\t")
	if err != nil {
		panic(err)
	}

	return string(jsonBytes)
}

// TODO: move to utils
func stringToJSONRawMessage(obj string) json.RawMessage {
	var res json.RawMessage

	err := json.Unmarshal([]byte(obj), &res)
	if err != nil {
		panic(err)
	}

	return res
}
