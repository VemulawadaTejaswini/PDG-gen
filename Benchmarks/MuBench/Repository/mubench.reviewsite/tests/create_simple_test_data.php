<?php
/** @var $container Interop\Container\ContainerInterface */

use Illuminate\Support\Facades\Schema;

echo '<br/>Inserting simple test data<br/>';
$experiment1 = \MuBench\ReviewSite\Models\Experiment::find(1);
$experiment2 = \MuBench\ReviewSite\Models\Experiment::find(2);
$experiment3 = \MuBench\ReviewSite\Models\Experiment::find(3);

echo 'Creating test detector<br/>';
$detector = new \MuBench\ReviewSite\Models\Detector;
$detector->muid = "TestDetector";
$detector->id = 1;
$detector->save();
$detector2 = new \MuBench\ReviewSite\Models\Detector;
$detector2->muid = "TestDetector_2";
$detector2->id = 2;
$detector2->save();

$runsController = new \MuBench\ReviewSite\Controllers\RunsController($container);

echo 'Creating run entries<br/>';
$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector);
Schema::dropIfExists($run->getTable());
$runsController->createRunsTable($run->getTable());
$runsController->addColumnToTable($run->getTable(), 'additional_stat');

$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector);
$run->id = 1;
$run->experiment_id = $experiment1->id;
$run->project_muid = 'mubench';
$run->version_muid = '42';
$run->result = 'success';
$run->number_of_findings = 2;
$run->runtime = 3.40;
$run->timestamp = 12;
$run->save();
$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector);
$run->id = 2;
$run->experiment_id = $experiment1->id;
$run->project_muid = 'mubench_2';
$run->version_muid = '43';
$run->result = 'success';
$run->number_of_findings = 0;
$run->runtime = 3.40;
$run->timestamp = 14;
$run->additional_stat = 'test';
$run->save();
$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector);
$run->id = 3;
$run->experiment_id = $experiment2->id;
$run->project_muid = 'mubench';
$run->version_muid = '42';
$run->result = 'success';
$run->number_of_findings = 2;
$run->runtime = 3.40;
$run->timestamp = 15;
$run->save();
$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector);
$run->id = 4;
$run->experiment_id = $experiment2->id;
$run->project_muid = 'mubench_2';
$run->version_muid = '43';
$run->result = 'success';
$run->number_of_findings = 0;
$run->runtime = 3.40;
$run->timestamp = 16;
$run->additional_stat = 'test';
$run->save();
$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector);
$run->id = 5;
$run->experiment_id = $experiment3->id;
$run->project_muid = 'mubench_3';
$run->version_muid = '1';
$run->result = 'failure';
$run->number_of_findings = 0;
$run->runtime = 3.40;
$run->timestamp = 16;
$run->additional_stat = 'test';
$run->save();
$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector);
$run->id = 8;
$run->experiment_id = $experiment3->id;
$run->project_muid = 'mubench_4';
$run->version_muid = '1';
$run->result = 'success';
$run->number_of_findings = 0;
$run->runtime = 3.40;
$run->timestamp = 16;
$run->save();

$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector2);
Schema::dropIfExists($run->getTable());
$runsController->createRunsTable($run->getTable());

$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector2);
$run->id = 6;
$run->experiment_id = $experiment3->id;
$run->project_muid = 'mubench_3';
$run->version_muid = '1';
$run->result = 'success';
$run->number_of_findings = 0;
$run->runtime = 3.40;
$run->timestamp = 16;
$run->save();
$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector2);
$run->id = 7;
$run->experiment_id = $experiment3->id;
$run->project_muid = 'mubench_4';
$run->version_muid = '1';
$run->result = 'success';
$run->number_of_findings = 0;
$run->runtime = 3.40;
$run->timestamp = 16;
$run->save();
$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector2);
$run->id = 9;
$run->experiment_id = $experiment2->id;
$run->project_muid = 'mubench';
$run->version_muid = '42';
$run->result = 'success';
$run->number_of_findings = 0;
$run->runtime = 3.40;
$run->timestamp = 16;
$run->save();
$run = new \MuBench\ReviewSite\Models\Run;
$run->setDetector($detector2);
$run->id = 10;
$run->experiment_id = $experiment2->id;
$run->project_muid = 'mubench_2';
$run->version_muid = '43';
$run->result = 'success';
$run->number_of_findings = 0;
$run->runtime = 3.40;
$run->timestamp = 16;
$run->save();

echo 'Creating findings entries<br/>';
$finding = new \MuBench\ReviewSite\Models\Finding;
$finding->setDetector($detector2);
Schema::dropIfExists($finding->getTable());
$runsController->createFindingsTable($finding->getTable());
$finding = new \MuBench\ReviewSite\Models\Finding;
$finding->setDetector($detector);
Schema::dropIfExists($finding->getTable());
$runsController->createFindingsTable($finding->getTable());
$runsController->addColumnToTable($finding->getTable(), 'additional_column');

$finding->experiment_id = $experiment1->id;
$finding->misuse_id = 1;
$finding->project_muid = 'mubench';
$finding->version_muid = '42';
$finding->misuse_muid = '1';
$finding->startline = 113;
$finding->rank = 1;
$finding->additional_column = 'test_column';
$finding->file = 'Test.java';
$finding->method = "method(A)";
$finding->save();
$finding = new \MuBench\ReviewSite\Models\Finding;
$finding->setDetector($detector);
$finding->experiment_id = $experiment1->id;
$finding->misuse_id = 2;
$finding->project_muid = 'mubench_2';
$finding->version_muid = '43';
$finding->misuse_muid = '1';
$finding->startline = 113;
$finding->rank = 1;
$finding->additional_column = 'test_column';
$finding->file = 'Test.java';
$finding->method = "method(A)";
$finding->save();
$finding = new \MuBench\ReviewSite\Models\Finding;
$finding->setDetector($detector);
$finding->experiment_id = $experiment2->id;
$finding->misuse_id = 3;
$finding->project_muid = 'mubench';
$finding->version_muid = '42';
$finding->misuse_muid = '1';
$finding->startline = 113;
$finding->rank = 1;
$finding->additional_column = 'test_column';
$finding->file = 'Test.java';
$finding->method = "method(A)";
$finding->save();
$finding = new \MuBench\ReviewSite\Models\Finding;
$finding->setDetector($detector);
$finding->experiment_id = $experiment2->id;
$finding->misuse_id = 4;
$finding->project_muid = 'mubench';
$finding->version_muid = '42';
$finding->misuse_muid = '2';
$finding->startline = 113;
$finding->rank = 1;
$finding->additional_column = 'test_column';
$finding->file = 'Test.java';
$finding->method = "method(A)";
$finding->save();
$finding = new \MuBench\ReviewSite\Models\Finding;
$finding->setDetector($detector);
$finding->experiment_id = $experiment2->id;
$finding->misuse_id = 5;
$finding->project_muid = 'mubench';
$finding->version_muid = '42';
$finding->misuse_muid = '3';
$finding->startline = 113;
$finding->rank = 1;
$finding->additional_column = 'test_column';
$finding->file = 'Test.java';
$finding->method = "method(A)";
$finding->save();

echo 'Creating finding snippets<br/>';
$snippet = new \MuBench\ReviewSite\Models\Snippet;
$snippet->project_muid = 'mubench';
$snippet->version_muid = '42';
$snippet->misuse_muid = '1';
$snippet->file = 'Test.java';
$snippet->line = 112;
$snippet->snippet = "test snippet\ntest";
$snippet->save();


echo 'Creating misuses (metadata)<br/>';
$metadata = new \MuBench\ReviewSite\Models\Metadata;
$metadata->project_muid = 'mubench';
$metadata->version_muid = '42';
$metadata->misuse_muid = '1';
$metadata->description = 'desc';
$metadata->fix_description = 'fix-desc';
$metadata->file = '/some/file.ext';
$metadata->method = 'method(P)';
$metadata->line = '1';
$metadata->diff_url = 'http://diff/url';
$metadata->save();
$metadata = new \MuBench\ReviewSite\Models\Metadata;
$metadata->project_muid = 'mubench';
$metadata->version_muid = '42';
$metadata->misuse_muid = '2';
$metadata->description = 'desc';
$metadata->fix_description = 'fix-desc';
$metadata->file = '/some/file.ext';
$metadata->method = 'method(P)';
$metadata->line = '1';
$metadata->diff_url = 'http://diff/url';
$metadata->save();
$metadata = new \MuBench\ReviewSite\Models\Metadata;
$metadata->project_muid = 'mubench_2';
$metadata->version_muid = '43';
$metadata->misuse_muid = '1';
$metadata->description = 'desc';
$metadata->fix_description = 'fix-desc';
$metadata->file = '/some/file.ext';
$metadata->method = 'method(P)';
$metadata->line = '1';
$metadata->diff_url = 'http://diff/url';
$metadata->save();
$metadata = new \MuBench\ReviewSite\Models\Metadata;
$metadata->project_muid = 'mubench_3';
$metadata->version_muid = '1';
$metadata->misuse_muid = '1';
$metadata->description = 'desc';
$metadata->fix_description = 'fix-desc';
$metadata->file = '/some/file.ext';
$metadata->method = 'method(P)';
$metadata->line = '1';
$metadata->diff_url = 'http://diff/url';
$metadata->save();
$metadata = new \MuBench\ReviewSite\Models\Metadata;
$metadata->project_muid = 'mubench_4';
$metadata->version_muid = '1';
$metadata->misuse_muid = '1';
$metadata->description = 'desc';
$metadata->fix_description = 'fix-desc';
$metadata->file = '/some/file.ext';
$metadata->method = 'method(P)';
$metadata->line = '1';
$metadata->diff_url = 'http://diff/url';
$metadata->save();

echo 'Creating correct usages<br/>';
$pattern = new \MuBench\ReviewSite\Models\CorrectUsage;
$pattern->metadata_id = 1;
$pattern->code = "m(A){\n\ta(A);\n}";
$pattern->line = 10;
$pattern->save();
$pattern = new \MuBench\ReviewSite\Models\CorrectUsage;
$pattern->metadata_id = 2;
$pattern->code = "m(A){\n\ta(A);\n}";
$pattern->line = 10;
$pattern->save();
$pattern = new \MuBench\ReviewSite\Models\CorrectUsage;
$pattern->metadata_id = 3;
$pattern->code = "m(A){\n\ta(A);\n}";
$pattern->line = 10;
$pattern->save();
$pattern = new \MuBench\ReviewSite\Models\CorrectUsage;
$pattern->metadata_id = 4;
$pattern->code = "m(A){\n\ta(A);\n}";
$pattern->line = 10;
$pattern->save();
$pattern = new \MuBench\ReviewSite\Models\CorrectUsage;
$pattern->metadata_id = 5;
$pattern->code = "m(A){\n\ta(A);\n}";
$pattern->line = 10;
$pattern->save();

echo 'Creating misuses<br/>';
$misuse = new \MuBench\ReviewSite\Models\Misuse;
$misuse->metadata_id = 1;
$misuse->misuse_muid = '1';
$misuse->run_id = 1;
$misuse->detector_id = $detector->id;
$misuse->save();
$misuse = new \MuBench\ReviewSite\Models\Misuse;
$misuse->metadata_id = 2;
$misuse->misuse_muid = '1';
$misuse->detector_id = $detector->id;
$misuse->run_id = 2;
$misuse->save();
$misuse = new \MuBench\ReviewSite\Models\Misuse;
$misuse->misuse_muid = '1';
$misuse->detector_id = $detector->id;
$misuse->run_id = 3;
$misuse->save();
$misuse = new \MuBench\ReviewSite\Models\Misuse;
$misuse->misuse_muid = '2';
$misuse->detector_id = $detector->id;
$misuse->run_id = 3;
$misuse->save();
$misuse = new \MuBench\ReviewSite\Models\Misuse;
$misuse->misuse_muid = '3';
$misuse->detector_id = $detector->id;
$misuse->run_id = 3;
$misuse->save();
$misuse = new \MuBench\ReviewSite\Models\Misuse;
$misuse->misuse_muid = '1';
$misuse->detector_id = $detector->id;
$misuse->run_id = 5;
$misuse->metadata_id = 4;
$misuse->save();
$misuse = new \MuBench\ReviewSite\Models\Misuse;
$misuse->misuse_muid = '1';
$misuse->detector_id = $detector2->id;
$misuse->metadata_id = 4;
$misuse->run_id = 6;
$misuse->save();
$misuse = new \MuBench\ReviewSite\Models\Misuse;
$misuse->misuse_muid = '1';
$misuse->detector_id = $detector2->id;
$misuse->metadata_id = 5;
$misuse->run_id = 7;
$misuse->save();
$misuse = new \MuBench\ReviewSite\Models\Misuse;
$misuse->misuse_muid = '1';
$misuse->detector_id = $detector->id;
$misuse->metadata_id = 5;
$misuse->run_id = 8;
$misuse->save();

echo 'Creating reviews<br/>';
$review = new \MuBench\ReviewSite\Models\Review;
$review->misuse_id = 1;
$review->reviewer_id = 3;
$review->comment = "This is a test comment 2!";
$review->save();
$review = new \MuBench\ReviewSite\Models\Review;
$review->misuse_id = 1;
$review->reviewer_id = 2;
$review->comment = "This is a test comment!";
$review->save();
$review = new \MuBench\ReviewSite\Models\Review;
$review->misuse_id = 3;
$review->reviewer_id = 2;
$review->comment = "This is a test comment!";
$review->save();
$review = new \MuBench\ReviewSite\Models\Review;
$review->misuse_id = 3;
$review->reviewer_id = 3;
$review->comment = "This is a test comment 2!";
$review->save();


echo 'Creating reviewers<br/>';
$reviewer1 = new \MuBench\ReviewSite\Models\Reviewer;
$reviewer1->name = 'reviewer';
$reviewer1->save();
$reviewer2 = new \MuBench\ReviewSite\Models\Reviewer;
$reviewer2->name = 'reviewer2';
$reviewer2->save();
$reviewer3 = new \MuBench\ReviewSite\Models\Reviewer;
$reviewer3->name = 'admin';
$reviewer3->save();


echo 'Creating finding reviews<br/>';
$findingReview = new \MuBench\ReviewSite\Models\FindingReview;
$findingReview->decision = 'Yes';
$findingReview->review_id = 1;
$findingReview->rank = '1';
$findingReview->save();
$findingReview = new \MuBench\ReviewSite\Models\FindingReview;
$findingReview->decision = 'Yes';
$findingReview->review_id = 2;
$findingReview->rank = '1';
$findingReview->save();
$findingReview = new \MuBench\ReviewSite\Models\FindingReview;
$findingReview->decision = 'Yes';
$findingReview->review_id = 3;
$findingReview->rank = '1';
$findingReview->save();
$findingReview = new \MuBench\ReviewSite\Models\FindingReview;
$findingReview->decision = 'No';
$findingReview->review_id = 4;
$findingReview->rank = '1';
$findingReview->save();


echo 'Creating Violations<br/>';
$type = new \MuBench\ReviewSite\Models\Violation;
$type->name = 'missing/call';
$type->save();

echo 'Creating Violations for metadata misuses<br/>';
$capsule->table('metadata_types')->insert(array('metadata_id' => 1, 'type_id' => 1));

echo 'Creating Violations for finding review<br/>';
$capsule->table('finding_review_types')->insert(array('finding_review_id' => 1, 'type_id' => 1));


echo 'Creating Tags<br/>';
$tag = new \MuBench\ReviewSite\Models\Tag;
$tag->name = 'test-dataset';
$tag->color = '#808080';
$tag->save();
$tag = new \MuBench\ReviewSite\Models\Tag;
$tag->name = 'test-dataset2';
$tag->color = '#808080';
$tag->save();

echo 'Creating MisuseTags<br/>';
$capsule->table('review_tags')->insert(array('review_id' => 3, 'tag_id' => 1));
$capsule->table('review_tags')->insert(array('review_id' => 1, 'tag_id' => 2));
$capsule->table('review_tags')->insert(array('review_id' => 3, 'tag_id' => 2));
