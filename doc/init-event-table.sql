drop table event;

create table event (
    id integer primary key,
    title varchar2(100) not null,
    season varchar2(10) not null,
    presenter varchar2(100) not null,
    event_date timestamp not null
);

insert into
    event (id, title, season, presenter, event_date)
values
    (
        108009,
        'Kubernetes�ō��R���e�i�x�[�X��CI��CD�̗[��',
        '1',
        'h',
        '2018-12-20 18:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        113733,
        'Microservices�̉^�p�E�Ď�',
        '1',
        's',
        '2019-01-25 18:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        119344,
        'JDK�J���҂����Microservices��Java�A�v���P�[�V����',
        '1',
        'i',
        '2019-03-07 18:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        122445,
        'Hyperledger Fabric�A�v���P�[�V�����݌v����K�C�h',
        '1',
        'n',
        '2019-03-28 18:00:00'
    );

insert into
    event (
        id,
        title,
        season,
        presenter,
        event_date
    )
values
    (
        124819,
        '�����Ă͒ʂ�Ȃ��I�F�؁E�F��',
        '1',
        'i',
        '2019-04-19 18:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        127773,
        '�l�ɂ��}�V���ɂ��D����API�̃G�R�V�X�e��',
        '1',
        'k',
        '2019-05-10 18:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        136115,
        '���ꂩ��͂��߂�IKubernetes��b',
        '2',
        's',
        '2019-07-17 18:00:00'
    );

insert into
    event (
        id,
        title,
        season,
        presenter,
        event_date
    )
values
    (
        140792,
        '��̉����m�Ȃ́HGraalVM�����',
        '2',
        's',
        '2019-09-19 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        147285,
        'Serverless�Ȑ��E���̂����Ă݂悤�I',
        '2',
        's',
        '2019-10-31 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        152768,
        'Oracle Cloud�ōl����p���A�[�L�e�N�`��',
        'premium',
        'm',
        '2019-11-29 18:30:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        155389,
        'Cloud Native����̃��_��Java�̐��E',
        '2',
        'k',
        '2019-12-19 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        158992,
        '�ό����݁�L����Kubernetes�̃G�R�V�X�e��',
        '2',
        'n',
        '2020-01-28 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        164814,
        '�N���E�h�E�A�v���P�[�V�����̃p�t�H�[�}���X',
        '2',
        'y',
        '2020-02-28 19:00:00'
    );

insert into
    event (
        id,
        title,
        season,
        presenter,
        event_date
    )
values
    (
        169396,
        'Cloud Native �~ Streaming �͂��߂̈��',
        '2',
        's',
        '2020-05-13 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        178405,
        'Cloud Native���̃X�g���[�W�Ǘ�',
        '3',
        'n',
        '2020-07-30 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        183712,
        '�T�[�r�X�ԒʐM�̃g�����h - gRPC & GraphQL����',
        '3',
        'n',
        '2020-08-27 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        186070,
        'Kubernetes�N���X�^�̊Ǘ��p',
        '3',
        'n',
        '2020-09-30 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        189340,
        '����IJava��Reactive�v���O���~���O',
        '3',
        'k',
        '2020-10-28 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        193618,
        '�����INoSQL�̊���',
        '3',
        'n',
        '2020-11-25 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        197023,
        '�R���e�i�E�����^�C���̖���',
        '3',
        'n',
        '2020-12-23 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        203362,
        'Oracle Cloud - Cloud Native 2021',
        'premium',
        'n',
        '2021-03-10 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        206439,
        '���̔F�؂̃C���n',
        '4',
        'k',
        '2021-04-07 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        207869,
        'Kubernetes�̃l�b�g���[�N',
        '4',
        'n',
        '2021-05-12 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        211934,
        'CI/CD �ŐV����',
        '4',
        'i',
        '2021-06-09 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        211935,
        '�}�C�N���T�[�r�X�ƃf�[�^�}�l�W�����g',
        'premium',
        'y',
        '2021-06-30 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        215000,
        '�}�C�N���T�[�r�X�̔F�؁E�F��JWT',
        '4',
        'k',
        '2021-07-07 19:00:00'
    );

commit;